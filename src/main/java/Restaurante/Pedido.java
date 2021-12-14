package Restaurante;

import java.util.Arrays;

public class Pedido implements IPedido {
    String id;
    Produto produtos[];
    Double valor;

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
    public void addProduto(Produto produto) {
        produtos.push(produto);
        valor += produto.valor;
    }
}
