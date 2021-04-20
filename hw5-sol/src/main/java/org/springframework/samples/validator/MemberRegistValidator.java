package org.springframework.samples.validator;

import org.springframework.samples.controller.member.MemberRegistRequest;
import org.springframework.samples.model.Address;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberRegistValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberRegistRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemberRegistRequest regReq = (MemberRegistRequest) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "required");
		
		if (regReq.hasPassword()) {
			if (regReq.getPassword().length() < 5)
				errors.rejectValue("password", "shortPassword");
			else if (!regReq.isSamePasswordConfirmPassword())
				errors.rejectValue("confirmPassword", "notSame");
		}
		
		String phone = regReq.getPhone();
		if (phone == null || phone.trim().isEmpty()) {
			errors.rejectValue("phone", "required");
		}
		else {
			if (phone.matches("01[01679]-\\d{3,4}-\\d{4}") == false)
				errors.rejectValue("phone", "invalidFormat");	
		}
		
		Address address = regReq.getAddress();
		if (address != null && address.getZipcode() != null) {			
			if (address.getZipcode().matches("\\d{5}") == false) {
				errors.rejectValue("address.zipcode", "invalid");	
				
				// 또는 아래와 같이 구현 가능 
				// errors.pushNestedPath("address");	
				// errors.rejectValue("zipcode", "invalid");	// address.zipcode에 해당
				// errors.popNestedPath();				
			}
		}
		 
		int length = regReq.getLength(); 
//		if (length == null || length.trim().isEmpty()) {
//			errors.rejectValue("length", "required");
//		}
//		else {
			try { 
				if (length > 30)
					errors.rejectValue("length", "tooLong");
			} catch (NumberFormatException e) {
				errors.rejectValue("length", "invalidNumber");
			}
	//	}					
	}
}
