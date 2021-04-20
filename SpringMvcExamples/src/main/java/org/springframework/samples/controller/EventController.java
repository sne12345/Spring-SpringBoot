 package org.springframework.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping("/event/list.do")
	public String list() {
		return "event/list";
	}
	
	@RequestMapping("/event/eventExpired.do")
	public String expired() {
		return "event/eventExpired";
	}
}
