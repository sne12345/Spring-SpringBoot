package org.springframework.samples.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.samples.model.Address;
import org.springframework.samples.model.MemberInfo;
import org.springframework.samples.validator.MemberInfoValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/account/create2.do")
@SessionAttributes("command")		// command 객체를 session에 저장
public class CreateAccountController2 {

	@ModelAttribute("command")		// command 객체  생성
	public MemberInfo formBacking(HttpServletRequest request) {
		MemberInfo mi = new MemberInfo();
		Address address = new Address();
		address.setZipcode(autoDetectZipcode(request.getRemoteAddr()));
		mi.setAddress(address);						
		System.out.println("formBacking() - command 객체 생성: " + mi);
		return mi;
	}

	private String autoDetectZipcode(String remoteAddr) {
		return "000000";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "account/creationForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") MemberInfo memberInfo, 
			BindingResult result,
			SessionStatus status) {
		System.out.println("submit() - command 객체: " + memberInfo);
		new MemberInfoValidator().validate(memberInfo, result);
		if (result.hasErrors()) {
			return "account/creationForm";
		}
		status.setComplete();		// session 종료
		return "account/created";
	}
}
