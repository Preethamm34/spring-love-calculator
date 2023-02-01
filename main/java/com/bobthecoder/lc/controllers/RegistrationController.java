package com.bobthecoder.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bobthecoder.lc.Validator.EmailValidator;
import com.bobthecoder.lc.Validator.UserNameValidator;
import com.bobthecoder.lc.api.CommunicationDTO;
import com.bobthecoder.lc.api.Phone;
import com.bobthecoder.lc.api.UserRegistrationDTO;
import com.bobthecoder.lc.propertyeditor.NamePropertyEditor;

@Controller
public class RegistrationController {

	@Autowired
	private EmailValidator emailValidator;
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRegistration") UserRegistrationDTO dto) {

		System.out.println("Inside showRegistrationPage method ");

		// load the saved user data from the database

		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("9844601556");

		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);

		dto.setCommunicationDTO(communicationDTO);

		return "user-registration-page";
	}

	@RequestMapping("/registration-sucess")
	public String processUserRegistration(@Valid @ModelAttribute("userRegistration") UserRegistrationDTO dto,
			BindingResult result) {
		System.out.println("Inside processUserRegistration method");
		System.out.println("Name entered by the user is : " + "|" +dto.getName()+ "|");
		
		
		//calling email method
		emailValidator.validate(dto, result);
		
		if (result.hasErrors()) {

	 		System.out.println("My page has errors");

			List<ObjectError> allErrors = result.getAllErrors();

			for (ObjectError error : allErrors) {
				System.out.println(error);
			}
			
			return "user-registration-page";
		}

		

		// save the dto object into our database

		return "registration-sucess";
	}
	
	//----------------------enough this is extra ------------------//
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside the init binder method");
		 
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,"name",editor);
		
 		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class,"name", nameEditor);
		
		  
		//binder.setDisallowedFields("name");
		
		UserNameValidator validator = new UserNameValidator();
		binder.addValidators(new UserNameValidator());
		//binder.addValidators(new EmailValidator());
		
	}
	
}
