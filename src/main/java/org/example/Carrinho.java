package org.example;

/*
▪Atributos: itens(List<ItemPedido>)
▪Métodos: adicionarItem(ItemPedido item), removerItem(ItemPedido item), getItens(), calcularValorTotal().
*/

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Double calcularValorTotal() {
        Double soma = 0D;
        for (ItemPedido item : itens) {
            soma += item.calcularSubtotal();
        }
        return soma;
    }


}
