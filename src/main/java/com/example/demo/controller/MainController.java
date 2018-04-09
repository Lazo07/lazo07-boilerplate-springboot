package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory
			.getLogger(MainController.class);
  
	@RequestMapping(value= "/")
	@ResponseBody
	public String index() {
		logger.info("Sample Info Message");
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
		return "Response Body Sample";
	}
  
	@RequestMapping(value= "/home")
	public String home() {
		return "home";
	}
	
}
