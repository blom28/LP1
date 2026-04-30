package org.example;

public class Fruta {

    private String madura = "Está Laranja está madura";
    private String comer = "comer a Laranja";
    private String estragar = "Está Laranja Apodreceu";


    public String madura() {
        return madura;
    }

    public Fruta setmadura(String madura) {
        this.madura = madura;
        return this;
    }

    public String Estragar(){
        return estragar;
    }

    public Fruta setEstragar(String estragar) {
        this.estragar = estragar;
        return this;
    }

    public String Comer(){
        return comer;
    }

    public Fruta setComer(String comer) {
        this.comer = comer;
        return this;
    }



    public String amadurecer() {
        return  madura;
    }

    public String comer() {
        return madura + " você pode " + comer;
    }

    public String estragar() {
        return estragar;
    }
}