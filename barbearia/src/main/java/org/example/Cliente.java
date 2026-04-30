package org.example;

public class Cliente {
    private String cliente = " o cliente ";
    private String escolhe = " escolhe o corte ";
    private String esperar = " espera ser atendido ";
    private String pagar = " pagou pelo corte ";

    public String getCliente() {
        return cliente;
    }

    public Cliente setCliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public String getEscolhe() {
        return escolhe;
    }

    public Cliente setEscolhe(String escolhe) {
        this.escolhe = escolhe;
        return this;
    }

    public String getEsperar() {
        return esperar;
    }

    public Cliente setEsperar(String esperar) {
        this.esperar = esperar;
        return this;
    }

    public String getPagar() {
        return pagar;
    }

    public Cliente setPagar(String pagar) {
        this.pagar = pagar;
        return this;
    }

    public String escolher() {
        return cliente + escolhe;
    }

    public String esperar() {
        return cliente + esperar;
    }

    public String pagar() {
        return cliente + pagar;
    }

}

    