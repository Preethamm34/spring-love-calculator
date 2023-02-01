package com.bobthecoder.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Assignment {

	
	// assignment
	
		@RequestMapping("/myass")
		public String myAssignment() {
			return "my-assignment";
		}
		@RequestMapping("/assignment")
		public String showResult(
				@RequestParam String name,
				@RequestParam String age, 
				@RequestParam String dob,
				@RequestParam String gender, 
				@RequestParam String email, 
				@RequestParam String phonenumber, 
				@RequestParam String address, 
				@RequestParam String state, 
				@RequestParam String district,
				Model model) {
			
			System.out.println(name + age + dob + gender + email + phonenumber + address + state + district);
			
			model.addAttribute("name", name);
			model.addAttribute("age", age);
			model.addAttribute("dob", dob);
			model.addAttribute("gender",gender);
			model.addAttribute("email",email);
			model.addAttribute("phonenumber",phonenumber);
			model.addAttribute("address", address);
			model.addAttribute("state",state);
			model.addAttribute("district", district);
			
			
			return "my-assignment";
		}
}
