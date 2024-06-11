package org.example;

/*
▪ Atributos: numero(int), data(Date), status(String), cliente(Cliente), itens(List<ItemPedido>),
pagamento(Pagamento), entrega(Entrega).
▪ Métodos:  getters  para  todos  os  atributos, adicionarItem(ItemPedido   item),
construtor que recebe numero, cliente, pagamentoe entrega.
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Integer numero;
    private Date data;
    private String status;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private Pagamento pagamento;
    private Entrega entrega;

    public Pedido (Integer numero, Cliente cliente, Pagamento pagamento, Entrega entrega) {
        this.numero = numero;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.entrega = entrega;
        this.data = new Date();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
