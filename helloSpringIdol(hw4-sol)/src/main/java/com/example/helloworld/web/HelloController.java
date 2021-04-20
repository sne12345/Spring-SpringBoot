package com.example.helloworld.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	private HelloService helloSvc;

	@Autowired
	public HelloController(SpringIdol springIdol) {
		springIdol.run();
	}
	
	@RequestMapping("/hello.do")		// request handler method
	public ModelAndView hello(			
		@RequestParam(value="name", required=false) String name) {
		
		String greeting = helloSvc.getGreeting();
		if (name != null) greeting = greeting + name;
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting", greeting);
		return mav;
	}

	@RequestMapping("/perform/{performerId}/requester/{requester}")		// request handler method
	public ModelAndView helloAndPerform(			
		@PathVariable(value="performerId", required=false) String id,
		@PathVariable(required=false) String requester) {	
		
		String greeting = helloSvc.getGreeting() + requester + ".";
		String result = null;
		if (id != null) {
			Performer performer = helloSvc.getPerformer(id);
			String performerName = performer.getName();			
			greeting = greeting + " I'm " + performerName + ".";
			result = performer.perform();
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("perform");
		mav.addObject("greeting", greeting);
		mav.addObject("performance", result);
		return mav;
	}

	@RequestMapping("/perform2")		// request handler method
	public String helloAndPerform2(Request request, Model model) {	// command class 이용		
		String greeting = helloSvc.getGreeting() + request.getRequester() + ".";
		String result = null; 
		if (request.getId() != null) {
			Performer performer = helloSvc.getPerformer(request.getId());
			String performerName = performer.getName();			
			greeting = greeting + " I'm " + performerName + ".";
			result = performer.perform();
		}
		model.addAttribute("greeting", greeting);
		model.addAttribute("performance", result);
		return "perform";
	}

}
