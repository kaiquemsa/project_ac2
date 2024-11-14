package com.example.ac2_ca.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.ActiveProfiles;

import com.example.ac2_ca.entity.Aluno;
import com.example.ac2_ca.entity.EmailAluno;

// @ActiveProfiles("ac2-test")
// @DataJpaTest
// public class UserRepositoryTest {
// @Autowired
// private AlunoRepository userRepository;

// @Test
// void testSaveAndFindUser() {
// // Cria um objeto User com um email válido
// Aluno user = new Aluno();
// user.setNome("testUser");
// user.setEmail(new EmailAluno("test@example.com"));

// // Salva no banco de dados
// Aluno savedUser = userRepository.save(user);
// assertNotNull(savedUser.getId()); // Verifica se o ID foi gerado

// // Busca o usuário pelo ID
// Optional<Aluno> retrievedUser = userRepository.findById(savedUser.getId());
// assertTrue(retrievedUser.isPresent());
// assertEquals("testUser", retrievedUser.get().getNome());
// }

// }
