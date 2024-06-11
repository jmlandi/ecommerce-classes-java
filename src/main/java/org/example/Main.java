package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando o cliente
        Cliente cliente = new Cliente("Marcos", "Franca/SP", "test@test.com");

        // Criando o carrinho
        Produto produto1 = new Produto(1, "Camiseta", 49.9D,"Camiseta do DSM");
        Produto produto2 = new Produto(2, "Regata", 29.9D,"Regata do DSM");
        ItemPedido item1 = new ItemPedido(produto1, 1);
        ItemPedido item2 = new ItemPedido(produto2, 2);
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        // Criando o pagamento
        Pagamento pagamento = new Pagamento(carrinho.calcularValorTotal(), "Pix");
        pagamento.pagar(109.7D);

        // Criando a entrega
        Entrega entrega = new Entrega("Rua J. Rodrigues, 1010", new Date());

        // Criando o pedido
        Pedido pedido = new Pedido(1, cliente, pagamento, entrega);
        for (ItemPedido item : carrinho.getItens()) {
            pedido.adicionarItem(item);
        }

        // Exibindo os valores
        System.out.println("Nome do número do pedido: " + pedido.getNumero());
        System.out.println("Nome do cliente: " + cliente.getNome());
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("----- Produto: " + item.getProduto().getNome() + " || Qtd: " + item.getQtd() + " || Preço: " + item.getProduto().getPreco() );
        }
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        System.out.println("Endereço de entrega: " + entrega.getEndereco());
        System.out.println("Pagamento realizado: " + pagamento.getDetalhesPagamento());


    }
}