package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import entity.User;
import valueObject.EmailUser;
import valueObject.Nome;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveAndFindAluno() {
        User user = new User();
        Nome nome = new Nome("Teste");
        user.setNome(nome);
        user.setEmail(new EmailUser("test@example.com"));

        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());

        Optional<User> retrievedUser = userRepository.findById(savedUser.getId());
        assertTrue(retrievedUser.isPresent());
        assertEquals("testAluno", retrievedUser.get().getName());
    }

}
