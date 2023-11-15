package com.devyeop.git5;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		String asdfString = "asdfasdfasdf";
		//asdf
		//2222
		//3333
		//4444
		//5555
		//6666
		
		//7777
		//8888
		//10-10-10
		
		String afterStashString = "스태쉬 꺼내서 다시 커밋하기 좋은 코드로 변경";
		String stashString = "개발하다가 커밋하긴 참 애매한 상황";
		
		String sdfasdfString = "리버트";
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
