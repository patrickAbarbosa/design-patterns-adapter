package Restaurante;

public interface IProduto {
    public void setNome(String nome);
    public String getNome();

    public void setDescricao(String descricao);
    public String getDescricao();

    public void setValor(Double valor);
    public Double getValor();
}
