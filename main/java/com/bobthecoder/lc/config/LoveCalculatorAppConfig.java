package com.bobthecoder.lc.config;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.bobthecoder.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.bobthecoder.lc")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {
	// added implements WebMvcConfigurer

	// set up my view resolver

	@Bean
	public InternalResourceViewResolver ViewResolver() {

		InternalResourceViewResolver ViewResolver = new InternalResourceViewResolver();
		ViewResolver.setPrefix("/WEB-INF/view/");
		ViewResolver.setSuffix(".jsp");
		return ViewResolver;
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	@Bean(name = "validator")
	public LocalValidatorFactoryBean validator() {

		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());

		return localValidatorFactoryBean;

	}

	// Mail sending configuration//

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setUsername("bob.barley0512@gmail.com"); // bob.barley0512@gmail.com //securesally@gmail.com
		javaMailSenderImpl.setPassword("xmbisnweooyysrnw"); // xmbisnweooyysrnw //bob5121996
		javaMailSenderImpl.setPort(587);

		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		javaMailSenderImpl.setJavaMailProperties(mailProperties);

		return javaMailSenderImpl;

	}

	//End of Mail sending configuration//
	
	// extra
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside addFormatter method");
		registry.addFormatter(new PhoneNumberFormatter());
	}

	@Override
	public Validator getValidator() {
		return validator();
	}

}
