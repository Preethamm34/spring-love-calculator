package com.bobthecoder.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer  //implements WebApplicationInitializer
	{

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);

		// create a dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// register the dispatcher servlet with the servlet object
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");

	}

}
