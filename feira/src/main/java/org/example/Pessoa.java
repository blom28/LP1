package org.example;

public class Pessoa {
    private String andam = "andam pela feira";
    private String compra = "compram";
    private String consomem = "pastel da feira";

    public String setandam(){
        return andam;
    }

    public Pessoa setAndam(String andam) {
        this.andam = andam;
        return this;
    }

    public String setcompra(){
        return compra;
    }

    public Pessoa setCompra(String compra) {
        this.compra = compra;
        return this;
    }


    public String setConsomem(){
        return consomem;
    }

    public Pessoa setConsomem(String consomem) {
        this.consomem = consomem;
        return this;
    }





    public String andam() {
        return " pessoas " + andam;
    }

    public String compra() {
        return " pessoas " + compra + " frutas ";
    }

    public String consomem() {
        return " As pessoas " + compra + " e consomem o " + consomem;
    }
}
