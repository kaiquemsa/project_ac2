package entity;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Nome {

    private String nome;

    protected Nome() {
    }

    public Nome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Nome nome = (Nome) o;
        return Objects.equals(nome, nome.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
