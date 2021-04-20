package org.springframework.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	@RequestMapping("/search/internal.do")
	public ModelAndView searchInternal(
			@RequestParam("query") String query,
			@RequestParam(value = "p", defaultValue = "1") int pageNumber) {
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		return new ModelAndView("search/internal");
	}

	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(
			@RequestParam(value="query", required=false) String query,
			@RequestParam(value = "p", defaultValue = "1") int pageNumber) {
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		return new ModelAndView("search/external");
	}
}
