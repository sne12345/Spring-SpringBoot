package com.example.helloworld.web;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.helloworld.domain.Request;
import com.example.helloworld.service.HelloService;
import com.example.springidol.Performer;
import com.example.springidol.SpringIdol;

@Controller
public class HelloController {
	
	@Autowired
	public HelloService helloService;
	
	@Autowired
	public HelloController(SpringIdol springIdol) {
		springIdol.run();
	}
	
	@RequestMapping("/hello.do")		// request handler method
	public ModelAndView hello(			
		@RequestParam(value="name", required=false) String name) {
		
		String greeting = helloService.getGreeting();
		if (name != null) greeting = greeting + name;
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting", greeting);
		return mav;
	}
	
	@RequestMapping("/perform/{beanName}/{requester}")		// request handler method
	public ModelAndView helloAndPerform(			
			@PathVariable(value="beanName", required=false) String beanName,
			@PathVariable(value="requester", required=false) String requester) {
		
		String greeting = helloService.getGreeting();
		Performer performer = helloService.getPerformer(beanName);
		String performResult = performer.perform();
		
		Date time = new Date();
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("perform");
		mav.addObject("greeting", greeting);
		mav.addObject("performerName", performer.getName());
		mav.addObject("requester", requester);
		mav.addObject("result", performResult);
		mav.addObject("time", time);
		
		return mav;
	}
	
	@RequestMapping("/perform2")		// request handler method
	public ModelAndView helloAndPerform2 (
			@ModelAttribute("command") Request request) {
		
		String greeting = helloService.getGreeting();
		Performer performer = helloService.getPerformer(request.getId());
		String performResult = performer.perform();
		
		Date time = new Date();
		
		ModelAndView perform = new ModelAndView("perform2");
		
		perform.addObject("greeting", greeting);
		perform.addObject("performerName", performer.getName());
		perform.addObject("requester", request.getRequester());
		perform.addObject("result", performResult);
		perform.addObject("time", time);
		
		return perform;
	}

	
}
