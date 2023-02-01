package com.bobthecoder.lc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bobthecoder.lc.api.EmailDTO;
import com.bobthecoder.lc.api.UserInfoDTO;
import com.bobthecoder.lc.service.LCAppEmailService;
import com.bobthecoder.lc.service.LCAppEmailServiceImpl;

@Controller
public class EmailController {

	// to send email
	@Autowired
	public LCAppEmailServiceImpl lcAppEmailService;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {

		model.addAttribute("emailDTO", new EmailDTO());
		// model.addAttribute("userName", UserName.toUpperCase());
		return "send-email-page";

	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,
			@ModelAttribute("emailDTO") EmailDTO emailDTO) {
 
		
		// to send email

		lcAppEmailService.sendEmail(userInfoDTO.getUserName(),emailDTO.getUserEmail(), userInfoDTO.getResult());

		return "process-email-page";

	}
}
