package valueObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailUserTest {

    @Test
    public void Construtor_Valido() {
        String email = "teste@exemplo.com";
        EmailUser emailUser = new EmailUser(email);
        assertEquals(email, emailUser.getEmailAddress());
    }

    @Test
    public void Construtor_SemValorValido() {
        EmailUser emailUser = new EmailUser();
        assertNull(emailUser.getEmailAddress());
    }

    @Test
    public void Construtor_DeveRetornarIllegalArgumentExceptionParaEmailInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new EmailUser("email_invalido"));
        assertThrows(IllegalArgumentException.class, () -> new EmailUser(null));
    }

    @Test
    public void GetEmailAddress_DeveRetornarEmail() {
        EmailUser emailUser = new EmailUser("teste@exemplo.com");
        assertEquals("teste@exemplo.com", emailUser.getEmailAddress());
    }

    @Test
    public void Equals_DeveRetornarTrueQuandoObjetosForemIguais() {
        EmailUser emailUser = new EmailUser("teste@exemplo.com");
        assertTrue(emailUser.equals(emailUser));
    }

    @Test
    public void Equals_DeveRetornarTrueQuandoObjetosDiferentesPossuiremOMesmoValor() {
        EmailUser email1 = new EmailUser("teste@exemplo.com");
        EmailUser email2 = new EmailUser("teste@exemplo.com");
        assertTrue(email1.equals(email2));
    }

    @Test
    public void Equals_DeveRetornarFalseQuandoObjetosDiferentesDevemPossuiremValoresDiferentes() {
        EmailUser email1 = new EmailUser("teste1@exemplo.com");
        EmailUser email2 = new EmailUser("teste2@exemplo.com");
        assertFalse(email1.equals(email2));
    }

    @Test
    public void Equals_DeveRetornarFalseQuandoObjetoForNulo() {
        EmailUser emailUser = new EmailUser("teste@exemplo.com");
        assertFalse(emailUser.equals(null));
    }

    @Test
    public void Equals_DeveRetornarFalseQuandoObjetosNaoForemDoMesmoTipo() {
        EmailUser emailUser = new EmailUser("teste@exemplo.com");
        String stringEmail = "teste@exemplo.com";
        assertFalse(emailUser.equals(stringEmail));
    }

    @Test
    public void HashCode_DeveRetornarHash() {
        EmailUser email = new EmailUser("teste@exemplo.com");
        assertNotNull(email.hashCode());
    }
}