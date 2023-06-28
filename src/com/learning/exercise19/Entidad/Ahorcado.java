package com.learning.exercise19.Entidad;

public class Ahorcado {

    //Atributos
    private String[] palabra;
    private int letrasEncontradas;
    private int vidas;

    //Constructor vacio
    public Ahorcado() {
    }

    //Constructor por parametro
    public Ahorcado(String[] palabra, int letrasEncontradas, int vidas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.vidas = vidas;
    }

    //Getter y Setters
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
