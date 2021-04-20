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

@Controller
@RequestMapping("/account/create.do")
public class CreateAccountController {

	@ModelAttribute("command")
	public MemberInfo formBacking(HttpServletRequest request) {
		MemberInfo mi;
		if (request.getMethod().equalsIgnoreCase("GET")) {
			mi = new MemberInfo();
			Address address = new Address();
			address.setZipcode(autoDetectZipcode(request.getRemoteAddr()));
			mi.setAddress(address);						
		} else {
			mi = new MemberInfo();
		}
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
			BindingResult result) {
		System.out.println("submit() - command 객체: " + memberInfo);
		new MemberInfoValidator().validate(memberInfo, result);
		if (result.hasErrors()) {
			return "account/creationForm";
		}
		return "account/created";
	}
}
