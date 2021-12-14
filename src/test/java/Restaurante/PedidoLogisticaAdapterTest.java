package Restaurante;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoLogisticaAdapterTest {
    @Test
    public void deveRetornarValorReal() {
        String produtos[] = { "refrigerante", "salgado" };
        Pedido pedido = new Pedido("123", produtos, 15.5);

        PedidoLogisticaAdapter pedidoLogistica = new PedidoLogisticaAdapter(pedido);

        assertEquals(15.5, pedido.getValor());
    }

    @Test
    public void deveRetornarItens() {
        String produtos[] = { "refrigerante", "salgado" };
        Pedido pedido = new Pedido("123", produtos, 15.5);

        PedidoLogisticaAdapter pedidoLogistica = new PedidoLogisticaAdapter(pedido);


        assertEquals("refrigerante, salgado", String.join(", ", pedidoLogistica.getItens()));
    }

    @Test
    public void deveRetornarId() {
        String produtos[] = { "refrigerante", "salgado" };
        Pedido pedido = new Pedido("123", produtos, 15.5);

        PedidoLogisticaAdapter pedidoLogistica = new PedidoLogisticaAdapter(pedido);

        assertEquals("123", pedidoLogistica.getId());
    }

    @Test
    public void deveRetornarPedido() {
        String produtos[] = { "refrigerante", "salgado" };
        Pedido pedido = new Pedido("123", produtos, 15.5);

        PedidoLogisticaAdapter pedidoLogistica = new PedidoLogisticaAdapter(pedido);

        assertEquals(pedido.toString(), pedidoLogistica.getPedido().toString());
    }
}