package com.bobthecoder.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bobthecoder.lc.api.UserInfoDTO;
import com.bobthecoder.lc.service.LCAppService;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {

	//calling the lovecalculation method
	@Autowired
	private LCAppService lcappService;
	
	@RequestMapping("/")
	public String showHomePage( Model model) {

		model.addAttribute("userInfo", new UserInfoDTO());
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(Model model, @Valid UserInfoDTO userInfoDTO , BindingResult result ) {
		 
		model.addAttribute("userInfo", userInfoDTO);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX +"userInfo", result );
		 
		
		System.out.println(userInfoDTO.isTermAndCondition());

		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);

			} 
			// System.out.println("my form has come errors...");
			return "home-page";
		}
		
		// write a service whivh will calculate love %
		
		String loveResult =  lcappService.calculateLove(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
		userInfoDTO.setResult(loveResult);
		 
		
		
		return "result-page";
	}

}

