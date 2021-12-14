package Restaurante;

import Logistica.PedidoLogistica;
import org.jetbrains.annotations.NotNull;

public class PedidoLogisticaAdapter implements IPedidoLogisticaAdapter {
    PedidoLogistica pedido;

    public PedidoLogisticaAdapter(Pedido pedido) {
        String idParceiro = this.preparaIdDoParceiro(pedido.getId());
        String itens = this.preparaItens(pedido.getProdutos());
        int valorEmCentavos = this.converterValorEmCentavos(pedido.getValor());

        this.pedido = new PedidoLogistica(idParceiro, itens, valorEmCentavos);
    }

    public void setPedido(Pedido pedido) {
        String idParceiro = this.preparaIdDoParceiro(pedido.getId());
        String itens = this.preparaItens(pedido.getProdutos());
        int valorEmCentavos = this.converterValorEmCentavos(pedido.getValor());

        this.pedido = new PedidoLogistica(idParceiro, itens, valorEmCentavos);
    }

    public Pedido getPedido() {
        String id = converterIdParceiroEmId(this.pedido.getIdParceiro());
        String produtos[] = converterEmItens(this.pedido.getItem());
        Double valor = converterValorEmReal(this.pedido.getValor());

        Pedido pedido = new Pedido(id, produtos, valor);

        return pedido;
    }

    private @NotNull String preparaIdDoParceiro(String id) {
        return "pedido-".concat(id);
    }

    private @NotNull String converterIdParceiroEmId(@NotNull String idDoParceiro) {
        String id = idDoParceiro.replace("pedido-", "");

        return id;
    }

    private int converterValorEmCentavos(Double valor) {
        double valorEmCentavos = valor * 100;

        return Integer.valueOf((int) valorEmCentavos);
    }

    private double converterValorEmReal(int valor) {
        double valorReal = (double)(valor) / 100;

        return valorReal;
    }

    private String preparaItens(String itens[]) {
        return String.join(", ", itens);
    }

    private String[] converterEmItens(String item) {
        return item.split(", ");
    }

    @Override
    public void setId(String id) {
        this.pedido.setIdParceiro(preparaIdDoParceiro(id));
    }

    @Override
    public String getId() {
        return this.converterIdParceiroEmId(this.pedido.getIdParceiro());
    }

    @Override
    public void setItens(String produtos[]) {
        pedido.setItem(this.preparaItens(produtos));
    }

    @Override
    public String[] getItens() {
        return this.converterEmItens(this.pedido.getItem());
    }

    @Override
    public void setValor(Double valor) {
        this.pedido.setValor(this.converterValorEmCentavos(valor));
    }

    @Override
    public Double getValor() {
        return this.converterValorEmReal(this.pedido.getValor());
    }
}
