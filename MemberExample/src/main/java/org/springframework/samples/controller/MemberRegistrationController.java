package org.springframework.samples.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.Address;
import org.springframework.samples.service.MemberService;
import org.springframework.samples.validator.MemberRegisterValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/register")
public class MemberRegistrationController {
	private static final String MEMBER_REGISTRATION_FORM 
//								= "member/registrationForm";
								= "member/registrationForm2";
	
	@Autowired
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@ModelAttribute("regReq") 			// request handler methods 보다 먼저 호출됨
	public MemberRegistRequest formBacking(HttpServletRequest request) {
		if (request.getMethod().equalsIgnoreCase("GET")) {
			MemberRegistRequest memRegReq = new MemberRegistRequest();
			Address address = new Address("01010", "", "");		// Address 객체 생성 및 초기화
			memRegReq.setAddress(address);
			return memRegReq;
		}
		else return new MemberRegistRequest();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return MEMBER_REGISTRATION_FORM;
	}
	
	/* 주의: formBacking() method 대신 아래와 같이 GET 처리 method에서 직접 객체 생성 및 초기화 가능
	@RequestMapping(method = RequestMethod.GET)
	public String form(@ModelAttribute("regReq") MemberRegistRequest memRegReq) {
		// MemberRegistRequest 객체는 이미 생성되어 파라미터로 넘어옴
		Address address = new Address("01010", "", "");		// Address 객체 생성 및 초기화
		memRegReq.setAddress(address);
		return MEMBER_REGISTRATION_FORM;
	}
	*/
	
	@RequestMapping(method = RequestMethod.POST)
	public String register(
			@ModelAttribute("regReq") MemberRegistRequest memRegReq,
			BindingResult bindingResult, Model model) {		
		System.out.println("command 객체: " + memRegReq);
		
		new MemberRegisterValidator().validate(memRegReq, bindingResult);	// validator 생성 및 호출 (입력 값 검증)
		if (bindingResult.hasErrors()) {
			return MEMBER_REGISTRATION_FORM;
		}
		String mid = memberService.registerNewMember(memRegReq);
		model.addAttribute("memberId", mid);
		return "member/registered";
	}
}
