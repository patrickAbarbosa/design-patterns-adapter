package Restaurante;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    public void deveRetornarId() {
        String produtos[] = { "cerveja", "tira gosto" };
        Pedido pedido = new Pedido("23", produtos, 32.0);

        assertEquals("23", pedido.getId());
    }

    @Test
    public void deveRetornarValor() {
        String produtos[] = { "cerveja", "tira gosto" };
        Pedido pedido = new Pedido("23", produtos, 32.0);

        assertEquals(32.0, pedido.getValor());
    }

    @Test
    public void deveRetornarValorInvalido() {
        try {
            String produtos[] = { "cerveja", "tira gosto" };
            Pedido pedido = new Pedido("23", produtos, -32.0);

            assertEquals(32.0, pedido.getValor());
        } catch (IllegalArgumentException e) {
            assertEquals("Valor deve ser maior que 0", e.getMessage());
        }
    }
}