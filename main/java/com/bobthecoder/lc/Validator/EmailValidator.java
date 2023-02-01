  package com.bobthecoder.lc.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bobthecoder.lc.api.UserRegistrationDTO;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty", "*Email cannot be empty");
		
		//email ending with gmail.com
		
		String email =  ((UserRegistrationDTO)target).getCommunicationDTO().getEmail();
		
		if (!email.endsWith("gmail.com")) {
			errors.rejectValue("communicationDTO.email", "email.invalidDomain", "*Email should ends with domain 'gmail.com'");
		}
	}

}
