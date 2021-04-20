package org.springframework.samples.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.service.SearchResult;
import org.springframework.samples.service.SearchService;
import org.springframework.samples.service.SearchType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class GameSearchController {
	@Autowired
	private SearchService searchService;

	static final Logger LOGGER = LoggerFactory.getLogger(GameSearchController.class);
	
	@ModelAttribute("searchTypeList")
	public List<SearchType> referenceSearchTypeList() {
		List<SearchType> options = new ArrayList<SearchType>();
		options.add(new SearchType(1, "전체"));
		options.add(new SearchType(2, "아이템"));
		options.add(new SearchType(3, "캐릭터"));
		return options;
	}

	@ModelAttribute("popularQueryList")
	public String[] getPopularQueryList() {
		return new String[] { "게임", "창천2", "위메이드" };
	}

	@RequestMapping("/search/main.do")
	public String main() {
		return "search/main";
	}

	@RequestMapping("/search/game.do")
	public ModelAndView search(@ModelAttribute("command") SearchCommand command) {
		ModelAndView mav = new ModelAndView("search/game");
	    LOGGER.info("검색어 : {} ", command.getQuery().toUpperCase());
	    SearchResult result = searchService.search(command);
		mav.addObject("searchResult", result);
		return mav;
	}

	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException ex) {
		return "error/nullException";
	}
	
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

}
