package org.example;

/*
▪Atributos: produto(Produto), quantidade(int).
▪Métodos:   getters   e setters   para   todos   os   atributos, calcularSubtotal(),
construtor que recebe produto e quantidade.
*/

public class ItemPedido {

    private Produto produto;
    private Integer qtd;

    public ItemPedido(Produto produto, Integer qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double calcularSubtotal() {
        Double preco = this.produto.getPreco();
        return preco * this.qtd;
    }
}
