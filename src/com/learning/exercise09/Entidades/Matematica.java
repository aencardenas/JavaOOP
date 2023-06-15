package com.learning.exercise09.Entidades;

public class Matematica {
    //Atributos
    private double primerNumero;
    private double segundoNumero;

    //Constructor vacio
    public Matematica() {
    }

    //Constructo por parametros
    public Matematica(double primerNumero, double segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    //Getter y Setters

    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
}
