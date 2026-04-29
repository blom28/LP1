package org.example;

import java.io.IOException;
import javafx.fxml.FXML;


public class Farmaceutico {
    private String atender = " atende o cliente ";
    private String cobrar = " cobrou o valor do produto ";
    private String organizar = " organizou as gôndolas ";
    private String nome = " O Farmaceutico Bruno ";

    public String setAtender() {
        return atender;
    }

    public Farmaceutico setAtender(String atender) {
        this.atender = atender;
        return this;
    }

    public String setCobrar() {
        return cobrar;
    }

    public Farmaceutico setCobrar(String cobrar) {
        this.cobrar = cobrar;
        return this;
    }

    public String setOrganizar() {
        return organizar;
    }

    public Farmaceutico setOrganizar(String organizar) {
        this.organizar = organizar;
        return this;
    }

    public String setNome() {
        return nome;
    }

    public Farmaceutico setNome(String nome) {
        this.nome = nome;
        return this;
    }


    public String atender() {
        return nome + atender;
    }

    public String cobrar() {
        return nome + cobrar;
    }

    public String organizar() {
        return nome + organizar;
    }
}
