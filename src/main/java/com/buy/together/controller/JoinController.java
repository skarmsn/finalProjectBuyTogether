package com.buy.together.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/*")
public class JoinController {
	
	private static final Logger logger = LoggerFactory.getLogger(FaqController.class);

	@RequestMapping(value ="/join", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		System.out.println("user/join");
		logger.info("Welcome home! The client locale is {}.", locale);

		return "/views/user/join";
		
	}

}