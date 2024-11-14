package com.example.ac2_ca.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	void testSetAndGetValidEmail() {
		Aluno user = new Aluno();
		EmailAluno email = new EmailAluno("test@example.com");
		user.setEmail(email);

		assertEquals(email, user.getEmail());
	}

	@Test
	void testInvalidEmailThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new EmailAluno("invalid-email");
		});
	}

}
