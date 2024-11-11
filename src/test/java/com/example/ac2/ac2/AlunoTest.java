package com.example.ac2.ac2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import entity.Aluno;
import entity.EmailAluno;
import entity.Nome;

public class AlunoTest {

    @Test
    public void deveCriarAlunoComNomeEEmailValidos() {
        Nome nome = new Nome("Kaique");
        EmailAluno email = new EmailAluno("kaique@dominio.com");
        Aluno aluno = new Aluno(nome, email);

        assertNotNull(aluno);
        assertEquals("Kaique", aluno.getNome().getnome()); // Verifique o valor do nome
        assertEquals("kaique@dominio.com", aluno.getEmail().getEmailAddress()); // Verifique o valor do email
    }
}