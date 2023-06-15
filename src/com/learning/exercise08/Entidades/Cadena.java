package com.learning.exercise08.Entidades;

public class Cadena {

    //Atributos
    private String frase;
    private int longitud;

    //Constructor vacio
    public Cadena() {
    }

    //Constructor por parametros
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    //Getters y Setters
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
