package org.springframework.samples.service;

import org.springframework.samples.controller.LoginCommand;

public interface Authenticator {

	void authenticate(LoginCommand loginCommand)
			throws AuthenticationException;

}
