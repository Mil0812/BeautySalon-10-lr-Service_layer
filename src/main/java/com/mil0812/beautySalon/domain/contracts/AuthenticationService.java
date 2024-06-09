package com.mil0812.beautySalon.domain.contracts;

import com.mil0812.beautySalon.persistence.entity.Client;

public interface AuthenticationService {

	Client authenticate(Integer id, String username, String password);
}
