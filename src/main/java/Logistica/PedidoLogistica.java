package Logistica;

public class PedidoLogistica implements IPedidoLogistica {
    String idDoParceiro;
    String item;
    int valorEmCentavos;

    public PedidoLogistica(String idDoParceiro, String item, int valorEmCentavos) {
        this.idDoParceiro = idDoParceiro;
        this.item = item;
        this.valorEmCentavos = valorEmCentavos;
    }

    @Override
    public void setIdParceiro(String idParceiro) {
        this.idDoParceiro = idParceiro;
    }

    @Override
    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public int getValor() {
        return valorEmCentavos;
    }

    @Override
    public void setValor(int valor) {
        this.valorEmCentavos = valor;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String getIdParceiro() {
        return idDoParceiro;
    }
}
