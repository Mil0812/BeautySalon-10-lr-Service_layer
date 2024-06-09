package com.mil0812.beautySalon;

import static java.lang.System.out;

import com.mil0812.beautySalon.domain.impl.AuthenticationServiceImpl;

public class Main3 {

	private static final AuthenticationServiceImpl authenticationService = AuthenticationServiceImpl.getInstance();

	public static void main(String[] args) {
		authenticationServiceTest();
	}

	private static void authenticationServiceTest() {
		var client = authenticationService.authenticate(2, "John Doe", "password");
		if (client != null) {
			out.println("Успішна аутентифікація");
		} else {
			out.println(
			    "Помилка аутентифікації. Користувача за введеними даними не знайдено");
		}
	}
}
