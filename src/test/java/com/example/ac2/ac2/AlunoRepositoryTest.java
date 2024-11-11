package com.example.ac2.ac2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;

import com.example.ac2.ac2.repository.AlunoRepository;

import entity.Aluno;
import entity.EmailAluno;
import entity.Nome;

@DataJpaTest
@ActiveProfiles("test")
@ComponentScan(basePackages = "com.example.ac2.ac2.repository")
@EntityScan("com.example.ac2.ac2.entity")
@EnableJpaRepositories("com.example.ac2.ac2.repository")
public class AlunoRepositoryTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    public void deveSalvarAluno() {
        Aluno aluno = new Aluno(new Nome("Kaique"), new EmailAluno("kaique@dominio.com"));
        Aluno savedAluno = alunoRepository.save(aluno);

        assertNotNull(savedAluno.getId());
        assertEquals("Kaique", savedAluno.getNome().getnome());
        assertEquals("kaique@dominio.com", savedAluno.getEmail().getEmailAddress());
    }
}
