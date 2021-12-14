package Restaurante;

public class Produto implements IProduto {
    String nome;
    String descricao;
    Double valor;

    public Produto(String nome, String descricao, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public void setValor(Double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor deve ser maior ou igual a 0");
        }

        this.valor = valor;
    }
}
