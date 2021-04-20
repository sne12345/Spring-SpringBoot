package org.springframework.samples.interceptor;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.samples.controller.GameSearchController;
import org.springframework.web.servlet.HandlerInterceptor;

public class EventExpirationCheckInterceptor implements HandlerInterceptor {

	static final Logger LOGGER = LoggerFactory.getLogger(GameSearchController.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (checkEvent(request)  && checkEventExpiration()) {
			displayEventExpirationPage(request, response);
			return false;
		}
		return true;
	}

	private boolean checkEvent(HttpServletRequest request) {
		return request.getRequestURI().equals(
				request.getContextPath() + "/event/list.do");
	}

	private boolean checkEventExpiration() {
		Calendar expire = Calendar.getInstance();
		expire.set(2021, 2, 31);  	
		Calendar cur = Calendar.getInstance();
		LOGGER.info("current time is {}.\n event expired at {} ", 
	    		cur.getTime(), expire.getTime());
		return cur.after(expire);
	}

	private void displayEventExpirationPage(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.sendRedirect("eventExpired.do");
	}

}
