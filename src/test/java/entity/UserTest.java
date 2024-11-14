package entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import valueObject.EmailUser;

public class UserTest {

	@Test
	void testSetAndGetValidEmail() {
		User user = new User();
		EmailUser email = new EmailUser("test@example.com");
		user.setEmail(email);

		assertEquals(email, user.getEmail());
	}

	@Test
	void testInvalidEmailThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new EmailUser("invalid-email");
		});
	}

}
