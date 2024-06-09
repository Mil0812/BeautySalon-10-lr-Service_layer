package com.mil0812.beautySalon.domain.impl;

import com.mil0812.beautySalon.domain.contracts.AuthenticationService;
import com.mil0812.beautySalon.domain.contracts.ClientService;
import com.mil0812.beautySalon.persistence.entity.Client;

public class AuthenticationServiceImpl implements AuthenticationService {

	private final ClientService clientService = ClientServiceImpl.getInstance();

	private AuthenticationServiceImpl() {
	}

	private static class AuthenticationServiceImplHolder {

		private static final AuthenticationServiceImpl authenticationServiceImpl = new AuthenticationServiceImpl();
	}

	public static AuthenticationServiceImpl getInstance() {
		return AuthenticationServiceImplHolder.authenticationServiceImpl;
	}

	@Override
	public Client authenticate(Integer id, String fullName, String password) {
		Client user = clientService.getClientById(id).orElse(null);

		if (user != null && (user.getFullName().equals(fullName) && user.getPassword().equals(password))) {
				return user;
		}
		return null;
	}
}