package Restaurante;

public interface IPedido {
    public void setId(String id);
    public String getId();
    public void setProdutos(String produtos[]);
    public String[] getProdutos();
    public Double getValor();
    public void setValor(Double valor);
}
