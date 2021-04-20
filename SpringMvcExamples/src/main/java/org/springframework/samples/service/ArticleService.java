package org.springframework.samples.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.samples.controller.NewArticleCommand;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	static final Logger LOGGER = LoggerFactory.getLogger(ArticleService.class);

	public void writeArticle(NewArticleCommand command) {
	    LOGGER.info("신규 게시글 등록: {} ", command);
	}
}
