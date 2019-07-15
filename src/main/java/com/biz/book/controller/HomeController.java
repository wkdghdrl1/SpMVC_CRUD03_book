package com.biz.book.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	/* logger level
	 * ALL, TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF
	 * 만약 log level을 warn 설정하면 ALL, TRACE, DEBUG, INFO를 무시하라
	 * 
	 * 만약 level을 info 설정하면
	 * ALL, TRACE, DEBUG를 무시하라
	 * */
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET )
	public String home(Locale locale, Model model) {
		
		// 콘솔을 통해서 어떤 메시지를 포시하거나
		// 변수가 값을 확인하고자 할 때는
		// System.out.println()을 사용하지 말고
		logger.debug("debug");
		logger.debug("debug");
		logger.info("info");
		logger.warn("debug");
		logger.debug("", (30+40));
		logger.debug("표시할 값 {}", 30+40);
		logger.debug("표시할 값 {} + {} = {}", 30, 40);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
		return "home";
	}
	
}
