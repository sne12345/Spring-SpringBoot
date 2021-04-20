package org.springframework.samples.service;

import org.springframework.samples.controller.SearchCommand;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

	public SearchResult search(SearchCommand command) {
		return new SearchResult();
	}

}
