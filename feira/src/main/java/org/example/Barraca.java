package org.example;

public class Barraca {
   private String nomeDono = "Seu João";
   private String fruta = "Laranja";
   private String guardar = "Guardar frutas";

   public String nomeDono(){
       return nomeDono;}

    public  Barraca setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
        return this;
    }

    public String fruta(){
       return fruta;}

    public Barraca setFruta(String fruta) {
        this.fruta = fruta;
        return this;
    }
    public String guardar(){
       return guardar;}

    public  Barraca setGuardar(String guardar) {
        this.guardar = guardar;
        return this;
    }

    public String organizar() {
       return " A barraca do " + nomeDono + " está organizada ";
    }

    public String demonstrar() {

       return nomeDono + " está mostrando as " + fruta;
    }

    public String armazenar() {

       return nomeDono + " está indo " + guardar;
    }
}
