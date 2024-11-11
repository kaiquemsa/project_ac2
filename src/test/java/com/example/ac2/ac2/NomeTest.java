// package com.example.ac2.ac2;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertThrows;

// import org.junit.jupiter.api.Test;

// import entity.Nome;

// public class NomeTest {
// @Test
// public void deveCriarNomeValido() {
// Nome nome = new Nome("João da Silva");
// assertNotNull(nome);
// assertEquals("João da Silva", nome.getnome());
// }

// @Test
// public void naoDeveCriarNomeInvalido() {
// assertThrows(IllegalArgumentException.class, () -> {
// new Nome("");
// });
// }

// @Test
// public void nomesIguaisDevemSerIguais() {
// Nome nome1 = new Nome("Maria Souza");
// Nome nome2 = new Nome("Maria Souza");
// assertEquals(nome1, nome2);
// }
// }
