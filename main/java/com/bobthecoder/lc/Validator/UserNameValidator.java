package com.bobthecoder.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bobthecoder.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	//check if the userNameValitator supports a given object
	@Override
	public boolean supports(Class<?> clazz) {
		
		
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	// we need to write our custom validation logic
	@Override
	public void validate(Object object, Errors errors) {

		//to check if the field is null
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "*User Name cannot be empty");
		
	
		//the String should contaoin a "_"
		
		String userName =  ((UserRegistrationDTO)object).getUserName();
	
		if(!userName.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString", "*User Name should have '_' or '@' char in between ");
		}
	}
}
