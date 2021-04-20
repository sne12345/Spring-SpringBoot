package org.springframework.samples.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.service.MemberService;
import org.springframework.samples.validator.MemberRegistValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/regist")
public class MemberRegistrationController {
	private static final String MEMBER_REGISTRATION_FORM = "member/registrationForm";
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(method = RequestMethod.GET)
	public String form(@ModelAttribute("memberInfo") MemberRegistRequest memRegReq) {
		return MEMBER_REGISTRATION_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String regist(
			@ModelAttribute("memberInfo") MemberRegistRequest memRegReq,
			BindingResult bindingResult, Model model) {
		System.out.println("command 객체: " + memRegReq);
		
		new MemberRegistValidator().validate(memRegReq, bindingResult);
		if (bindingResult.hasErrors()) {
			return MEMBER_REGISTRATION_FORM;
		}
		String mid = memberService.registNewMember(memRegReq);
		model.addAttribute("memberId", mid);
		return "member/registered";
	}

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

}
