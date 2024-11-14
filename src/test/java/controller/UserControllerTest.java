package controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;
import service.UserService;
import dto.UserDTO;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DataJpaTest
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testGetUsers() throws Exception {
        UserDTO mockUser = new UserDTO("JohnDoe", "john@example.com");
        mockUser.setNome("JohnDoe");
        mockUser.setEmail("john@example.com");

        List<UserDTO> mockUsers = List.of(mockUser);
        Mockito.when(userService.listarUsers()).thenReturn(mockUsers);

        mockMvc.perform(MockMvcRequestBuilders.get("/users")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].username").value("JohnDoe"))
                .andExpect(jsonPath("$[0].email").value("john@example.com"));
    }
}