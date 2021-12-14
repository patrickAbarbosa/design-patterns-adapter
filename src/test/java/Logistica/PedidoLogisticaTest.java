package Logistica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoLogisticaTest {
    @Test
    public void deveRetornarItem() {
        PedidoLogistica pedidoLogistica = new PedidoLogistica("12", "cerveja", 8000);

        assertEquals("cerveja", pedidoLogistica.getItem());
    }

    @Test
    public void deveRetornarIdDoParceiro() {
        PedidoLogistica pedidoLogistica = new PedidoLogistica("12", "cerveja", 8000);

        assertEquals("12", pedidoLogistica.getIdParceiro());
    }

    @Test
    public void deveRetornarValor() {
        PedidoLogistica pedidoLogistica = new PedidoLogistica("12", "cerveja", 8000);

        assertEquals(8000, pedidoLogistica.getValor());
    }
}