package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private String nome;

    @Embedded
    private EmailAluno email;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public EmailAluno getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(EmailAluno email) {
        this.email = email;
    }
}
