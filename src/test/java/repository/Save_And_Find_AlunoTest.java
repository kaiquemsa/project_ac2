package repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import entity.User;
import valueObject.Nome;

@DataJpaTest
public class Save_And_Find_AlunoTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndFindAluno() {
        User user = new User();
        Nome nome = new Nome("testAluno1");
        user.setNome(nome);

        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());

        Optional<User> retrievedUser = userRepository.findById(savedUser.getId());
        assertThat(retrievedUser).isPresent();
        assertThat(retrievedUser.get().getName()).isEqualTo("testAluno1");
    }

}