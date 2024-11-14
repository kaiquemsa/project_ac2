package com.example.ac2_ca.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.ac2_ca.dto.UserDTO;
import com.example.ac2_ca.service.UserService;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// @ActiveProfiles("ac-2test")
// @DataJpaTest
// public class UserControllerTest {

// @Autowired
// private MockMvc mockMvc;

// @MockBean
// private UserService userService; // Injeta um mock do serviço, substituindo a
// necessidade do repositório

// @Test
// public void testGetUsers() throws Exception {
// // Configura o comportamento do mock para o método de serviço
// UserDTO mockUser = new UserDTO();
// mockUser.setId(1L);
// mockUser.setName("JohnDoe");
// mockUser.setEmail("john@example.com");

// List<UserDTO> mockUsers = List.of(mockUser);
// Mockito.when(userService.getAllUsers()).thenReturn(mockUsers);

// // Realiza a requisição e verifica a resposta
// mockMvc.perform(MockMvcRequestBuilders.get("/users") // Corrige o caminho da
// URL
// .accept(MediaType.APPLICATION_JSON))
// .andExpect(status().isOk())
// .andExpect(jsonPath("$[0].username").value("JohnDoe")) // Corrige o nome do
// campo
// .andExpect(jsonPath("$[0].email").value("john@example.com"));
// }
// }