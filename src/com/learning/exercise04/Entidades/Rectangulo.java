package com.learning.exercise04.Entidades;

public class Rectangulo {

    //Atributos
    private int base;
    private int altura;

    //Constructor por defecto
    public Rectangulo() {
    }

    //Constructor por parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getters y Setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
