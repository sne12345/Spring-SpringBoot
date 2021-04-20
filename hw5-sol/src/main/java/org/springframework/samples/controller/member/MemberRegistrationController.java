package org.springframework.samples.controller.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.Address;
import org.springframework.samples.model.MemberInfo;
import org.springframework.samples.model.PerformerType;
import org.springframework.samples.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/member/register")
@SessionAttributes("regReq")			// session을 이용해서 command 객체를 재사용
public class MemberRegistrationController {
	private static final String FORM_VIEW = "member/registrationForm";
	private static final String RESULT_VIEW = "member/registered";
	
	@Autowired
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@ModelAttribute("performerTypes")
	public PerformerType[] referencePerformerTypes() {
		return PerformerType.values();
	}
	
	/* 위에서는 열거형 타입을 활용했으나, 아래와 같이 String 이용 가능 */
	/*	
 	@ModelAttribute("performerTypes")
	public List<String> referencePerformerTypes() {
		List<String> types = new ArrayList<String>();
		types.add("Instrumentalist");
		types.add("Singer");
		types.add("PoeticJuggler");
		types.add("OneManBand");
		return types;
	}     
	*/
	
	@ModelAttribute("regReq")
	public MemberRegistRequest formBacking() {
		MemberRegistRequest memRegReq = new MemberRegistRequest();
		Address address = new Address();
		address.setCity("서울");
		memRegReq.setAddress(address);
		memRegReq.setLength(20);
		return memRegReq;
	}   

	/* Session을 이용하지 않을 경우 아래와 같이 구현 */
	/*
	@ModelAttribute("regReq")
	public MemberRegistRequest formBacking(HttpServletRequest request) {
		MemberRegistRequest memRegReq = new MemberRegistRequest();
		if (request.getMethod().equalsIgnoreCase("GET")) {	// GET request인 경우만 초기화
			Address address = new Address();
			address.setCity("서울");
			memRegReq.setAddress(address);
			memRegReq.setLength(20);
		}
		return memRegReq;
	}   
	*/
	
	/* 위와 같은 별도의 method를 정의하지 않고 아래와 같이 form 요청 처리 method에서 command 객체를 초기화 하는 것도 가능함 */
	/*
	@GetMapping
	public String form(@ModelAttribute("regReq") MemberRegistRequest memRegReq) {   
		// command 객체는 DispatcherServlet이 생성하고 파라미터로 전달됨
		Address address = new Address();	// Address 객체는 직접 생성 필요
		address.setCity("서울");
		memRegReq.setAddress(address);
		memRegReq.setLength("20");
		return FORM_VIEW;
	}
	*/
	
	@GetMapping
	public String form() {
		return FORM_VIEW;
	}
	
	@PostMapping
	public String regist(
			@Valid @ModelAttribute("regReq") MemberRegistRequest memRegReq,
			BindingResult bindingResult, Model model,
			SessionStatus sessionStatus) {		
		System.out.println("command 객체: " + memRegReq);
		
		// @Valid와 Hibernate Validator를 이용해서 객체 검증 실시
		
		// MemberRegistValidator를 직접 구현하여 사용할 경우에는 아래 코드 실행
		// new MemberRegistValidator().validate(memRegReq, bindingResult);	
		
		if (bindingResult.hasErrors()) {
			return FORM_VIEW;
		}

		MemberInfo mi = memberService.registNewMember(memRegReq);
		model.addAttribute("newMember", mi);
		
		List<MemberInfo> members = memberService.getMembers();
		model.addAttribute("members", members);
		
		sessionStatus.setComplete(); // session에서 객체 삭제
		return RESULT_VIEW;
	}	
}
