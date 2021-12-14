package Restaurante;

public interface IPedidoLogisticaAdapter {
    public void setPedido(Pedido pedido);
    public Pedido getPedido();
    public void setId(String id);
    public String getId();
    public void setItens(String produtos[]);
    public String[] getItens();
    public void setValor(Double valor);
    public Double getValor();
}
