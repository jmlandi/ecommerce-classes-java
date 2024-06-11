package org.example;

/*
▪Atributos: codigo(int), nome(String), preco(double), descricao(String).
▪Métodos:  getters  para  todos  os  atributos,  construtor  que  recebe codigo, nome, preco e descricao.
*/

public class Produto {

    private Integer codigo;
    private String nome;
    private Double preco;
    private String desc;

    public Produto(Integer codigo, String nome, Double preco, String desc) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desc = desc;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
