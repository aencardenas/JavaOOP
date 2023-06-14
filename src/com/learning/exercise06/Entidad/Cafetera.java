package com.learning.exercise06.Entidad;

public class Cafetera {

    //Atributos
    private int capacidadMaxima;
    private int capacidadActual;

    //Constructor predeterminado
    public Cafetera() {
        capacidadMaxima = 2000;
    }

    //Constructor por parametros
    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    //Getters y Setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
}
