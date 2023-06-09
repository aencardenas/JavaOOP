package com.learning.exercise02.Entidad;

public class Circunferencia {
    private double radio;

    //Constructor vacio
    public Circunferencia(){

    }

    //Constructor por parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
