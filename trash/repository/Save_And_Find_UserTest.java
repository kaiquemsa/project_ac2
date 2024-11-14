package com.example.ac2_ca.repository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.ac2_ca.entity.Aluno;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// @ActiveProfiles("ac2-test")
// @ExtendWith(SpringExtension.class)
// @DataJpaTest
// public class Save_And_Find_UserTest {
// @Autowired
// private AlunoRepository userRepository;

// @Test
// public void testSaveAndFindUser() {
// // Cria um novo usuário
// Aluno user = new Aluno();
// user.setNome("testUser1");

// // Salva no banco de dados
// Aluno savedUser = userRepository.save(user);
// assertNotNull(savedUser.getId());
// // Busca o usuário pelo ID
// Optional<Aluno> retrievedUser = userRepository.findById(savedUser.getId());
// assertThat(retrievedUser).isPresent();
// assertThat(retrievedUser.get().getNome()).isEqualTo("testUser1");
// }

// }
