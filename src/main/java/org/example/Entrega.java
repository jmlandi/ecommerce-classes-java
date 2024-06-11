package org.example;

/*
▪Atributos: endereco(String), dataPrevista(Date).
▪Métodos: getters e setters para todos os atributos, construtor que recebe enderecoe dataPrevista.
*/


import java.util.Date;

public class Entrega {

    private String endereco;
    private Date dataPrevista;

    public Entrega(String endereco, Date dataPrevista) {
        this.endereco = endereco;
        this.dataPrevista = dataPrevista;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }
}
