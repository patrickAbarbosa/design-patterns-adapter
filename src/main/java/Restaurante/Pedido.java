package Restaurante;

public class Pedido implements IPedido {
    String id;
    String produtos[];
    Double valor;

    public Pedido(String id, String produtos[], Double valor) {
        if (valor < 0) {
            throw  new IllegalArgumentException("Valor deve ser maior que 0");
        }

        this.id = id;
        this.produtos = produtos;
        this.valor = valor;
    }

    @Override
    public void setId(String id) {
        this.id = id;
        valor = Double.valueOf(0);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setProdutos(String produtos[]) {
        this.produtos = produtos;
    }

    @Override
    public String[] getProdutos() {
        return produtos;
    }

    public void setValor(Double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor deve ser maior ou igual a 0");
        }

        this.valor = valor;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    public String toString() {
        String produtos = String.join(", ", this.produtos);

        return "{ id: " + id + ", produtos: [" + produtos + "], valor: " + String.valueOf(valor)  + " }";
    }
}
