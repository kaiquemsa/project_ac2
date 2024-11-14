package com.example.ac2_ca.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.ac2_ca.dto.UserDTO;
import com.example.ac2_ca.entity.Aluno;
import com.example.ac2_ca.entity.EmailAluno;
import com.example.ac2_ca.repository.AlunoRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Mock
    private AlunoRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        // Configurando dados fictícios
        Aluno user1 = new Aluno();
        user1.setId(1L);
        user1.setNome("user1");
        user1.setEmail(new EmailAluno("user1@example.com"));

        Aluno user2 = new Aluno();
        user2.setId(2L);
        user2.setNome("user2");
        user2.setEmail(new EmailAluno("user2@example.com"));

        // Mock do comportamento do repositório
        when(userRepository.findAll()).thenReturn(Arrays.asList(user1, user2));

        // Chamada ao método de serviço
        List<AlunoDTO> users = userService.getAllUsers();

        // Verificação dos resultados
        assertEquals(2, users.size());
        assertEquals("user1", users.get(0).getName());
        assertEquals("user1@example.com", users.get(0).getEmail());
    }
}