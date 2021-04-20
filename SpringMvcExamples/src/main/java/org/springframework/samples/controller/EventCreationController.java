package org.springframework.samples.controller;

import org.springframework.samples.model.EventForm;
import org.springframework.samples.validator.EventFormStep1Validator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("eventForm")		// eventForm 객체를 Session에 저장
public class EventCreationController {
	
	@ModelAttribute("eventForm")	// eventForm 객체 생성 
	public EventForm formData() {
		return new EventForm();
	}

	@RequestMapping("/newevent/step1")	// step1 요청
	public String step1() {
		return "event/creationStep1";		// step1 view로 이동
	}
		
	@PostMapping("/newevent/step2")		// step1 -> step2 이동	
	public String step2(@ModelAttribute("eventForm") EventForm formData, BindingResult result) {
		// session에 저장된 eventForm 객체에 저장된 입력 값 검증
		new EventFormStep1Validator().validate(formData, result);	
		if (result.hasErrors())
			return "event/creationStep1";	// 검증 오류 발생 시 step1 view로 이동
		return "event/creationStep2";		// step2 view로 이동
	}

	@GetMapping("/newevent/step2")		// step3 -> step2 이동
	public String step2FromStep3() {
		return "event/creationStep2";		// step2 view로 이동
	}

	@PostMapping("/newevent/step3")		// step2 -> step3 이동
	public String step3(@ModelAttribute("eventForm") EventForm formData, BindingResult result) {
		// session에 저장된 eventForm 객체에 저장된 target 입력 값 검증
		ValidationUtils.rejectIfEmpty(result, "target", "required");
		if (result.hasErrors())
			return "event/creationStep2";	// 검증 오류 발생 시 step2 view로 이동
		return "event/creationStep3";		// step3 view로 이동
	}

	@PostMapping("/newevent/done")		// step3 -> done 이동
	public String done(@ModelAttribute("eventForm") EventForm formData, SessionStatus sessionStatus) {
		sessionStatus.setComplete();	// session 종료
		return "event/creationDone";		// done view로 이동
	}

}
