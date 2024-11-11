package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Nome nome;

    @Embedded
    private EmailAluno email;

    public Aluno(Nome nome, EmailAluno email) {
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Nome getNome() {
        return nome;
    }

    public EmailAluno getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public void setEmail(EmailAluno email) {
        this.email = email;
    }
}
