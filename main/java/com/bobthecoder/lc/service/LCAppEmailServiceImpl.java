package com.bobthecoder.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService {

	@Autowired
	private JavaMailSender JavaMailSenderImpl;

	

	@Override 
	public void sendEmail(String userName, String userEmail, String result) {
	  
	  SimpleMailMessage newEmail = new SimpleMailMessage();
	  newEmail.setTo(userEmail);
	  newEmail.setSubject("Love Calculator Application Result");
	  newEmail.setText("Hi, " + userName +"."+" The Result Preducted By the Love Calculator Application Is : " + result);
	  JavaMailSenderImpl.send(newEmail);
	  
	  }
	 

	

}
