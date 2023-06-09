package com.learning.exercise03.Entidades;

public class Operacion {

    private  int primerNumero;
    private int segundoNumero;

    //Constructor vacio
    public Operacion(){

    }

    //Constructor con parametros
    public Operacion(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    //Getters y Setters

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
}
