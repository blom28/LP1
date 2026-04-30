package org.example;

public class Maquininha {
    private String nome = " Joaquim ";
    private String ajustar = " ajustou a maquininha";
    private String desligar = " desligou a maquininha";
    private String ligar = " ligou a maquininha";

    public String getNome() {
        return nome;
    }

    public Maquininha setNome(String nome) {
        this.nome = nome;
        return this;

    }

    public String getAjustar() {
        return ajustar;
    }

    public Maquininha setAjustar(String ajustar) {
        this.ajustar = ajustar;
        return this;
    }

    public String getDesligar() {
        return desligar;
    }

    public Maquininha setDesligar(String desligar) {
        this.desligar = desligar;
        return this;
    }

    public String getLigar() {
        return ligar;
    }

    public Maquininha setLigar(String ligar) {
        this.ligar = ligar;
        return this;
    }

    public String ajustar() {
        return nome + ajustar;
    }

    public String desligar() {
        return nome + desligar;
    }

    public String ligar() {
        return nome + ligar;
    }
}
