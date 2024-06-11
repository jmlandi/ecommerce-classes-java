package org.example;

/*
▪Atributos: valor(double), formaPagamento(String).
▪Métodos: pagar(double  valor), getDetalhesPagamento(),  construtor  que  recebe valor e formaPagamento.
*/

public class Pagamento implements Pagavel {

    private Double valor;
    private String formaPagamento;

    public Pagamento (Double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    @Override
    public void pagar(Double valor) { this.valor = valor; }

    @Override
    public String getDetalhesPagamento() {
        return "Valor: " + valor + " Forma de pagamento: " + formaPagamento;
    }
}
