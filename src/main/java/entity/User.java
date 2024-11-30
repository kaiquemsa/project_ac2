package entity;

import jakarta.persistence.*;
import valueObject.EmailUser;
import valueObject.Nome;

@Entity
@Table(name = "tb_aluno")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Nome nome;

    @Embedded
    private EmailUser email;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return nome.getnome();
    }

    public void setNome(Nome name) {
        this.nome = name;
    }

    public EmailUser getEmail() {
        return email;
    }

    public void setEmail(EmailUser email) {
        this.email = email;
    }
}
