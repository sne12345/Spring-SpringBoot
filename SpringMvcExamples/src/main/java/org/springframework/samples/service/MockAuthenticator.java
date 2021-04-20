package org.springframework.samples.service;

import org.springframework.samples.controller.LoginCommand;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MockAuthenticator implements Authenticator {

	static final Logger LOGGER = LoggerFactory.getLogger(MockAuthenticator.class);
	
	@Override
	public void authenticate(LoginCommand loginCommand)
			throws AuthenticationException {
		if (!loginCommand.getUserId().equals(loginCommand.getPassword())) {
	        LOGGER.info("인증 에러: userId is {}, password is {} ", 
	        	loginCommand.getUserId(), loginCommand.getPassword());
			throw new AuthenticationException();
		}
	}
}
