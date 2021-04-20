package org.springframework.samples.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting", getGreeting());
		return mav;
	}

	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 11) {
			return "Good morning!";
		} else if (hour > 11 && hour <= 14) {
			return "Did you have lunch?";
		} else if (hour > 14 && hour <= 18) {
			return "Good afternoon!";
		} else if (hour > 18 && hour <= 24) {
			return "Good evening!";
		}
		return "Hello!";
	}

}
