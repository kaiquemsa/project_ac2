package valueObject;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmailUser {

    private String emailAddress;

    // Construtor padrão necessário para o JPA
    protected EmailUser() {
    }

    public EmailUser(String emailAddress) {
        if (emailAddress == null || !emailAddress.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Sobrescreva equals e hashCode para garantir comparação por valor
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EmailUser email = (EmailUser) o;
        return Objects.equals(this.emailAddress, email.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
