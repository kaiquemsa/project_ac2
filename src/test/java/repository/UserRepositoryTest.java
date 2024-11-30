package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.ac2_ca.Ac2CaApplication;

import entity.User;
import valueObject.EmailUser;
import valueObject.Nome;

@ExtendWith(SpringExtension.class)
@DataJpaTest

@ContextConfiguration(classes = Ac2CaApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ComponentScan(basePackages = { "repository", "entity", "valueObject" })
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveAndFindAluno() {
        User user = new User();
        Nome nome = new Nome("testAluno");
        user.setNome(nome);
        user.setEmail(new EmailUser("test@example.com"));

        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());

        Optional<User> retrievedUser = userRepository.findById(savedUser.getId());
        assertTrue(retrievedUser.isPresent());
        assertEquals("testAluno", retrievedUser.get().getName());
    }

}
