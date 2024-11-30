package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import entity.User;
import repository.UserRepository;
import valueObject.EmailUser;
import valueObject.Nome;
import dto.UserDTO;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        User user1 = new User();
        Nome nome = new Nome("user1");

        user1.setId(1L);
        user1.setNome(nome);
        user1.setEmail(new EmailUser("user1@example.com"));

        User user2 = new User();
        Nome nome2 = new Nome("user2");
        user2.setId(2L);
        user2.setNome(nome2);
        user2.setEmail(new EmailUser("user2@example.com"));

        when(userRepository.findAll()).thenReturn(Arrays.asList(user1, user2));

        List<UserDTO> users = userService.listarUsers();

        assertEquals(2, users.size());
        assertEquals("user1", users.get(0).getNome());
        assertEquals("user1@example.com", users.get(0).getEmail());
    }
}