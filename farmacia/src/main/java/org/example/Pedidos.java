package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class Pedidos {
private String entrega = " está saindo para entrega ";
private String medicamento = "sua medicação já está pronta e pode ser aplicada";
private String receita = " está receita está vencida";


    public String getEntrega() {
        return entrega;
    }

    public Pedidos setEntrega(String entrega) {
        this.entrega = entrega;
        return this;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public Pedidos setMedicamento(String medicamento) {
        this.medicamento = medicamento;
        return this;
    }

    public String getReceita() {
        return receita;
    }

    public Pedidos setReceita(String receita) {
        this.receita = receita;
        return this;
    }

    public String entrega() {
        return " seu medicamento " + entrega;
    }

    public String medicamento() {
        return medicamento;
    }

    public String receita() {
        return receita;
    }
}
