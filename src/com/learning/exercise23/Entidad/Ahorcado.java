package com.learning.exercise23.Entidad;

import java.util.HashSet;
import java.util.Set;

public class Ahorcado {

    //Atributos
    private String palabraABuscar;
    private int vidas;
    public static Set<String> letrasEnLaPalabra;
    public static String[] arrayLetras;


    //Constructor vacio
    public Ahorcado() {
        letrasEnLaPalabra = new HashSet<String>();
    }

    //Constructor por parametros
    public Ahorcado(String palabraABuscar, int vidas) {
        this.palabraABuscar = palabraABuscar;
        this.vidas = vidas;
        letrasEnLaPalabra = new HashSet<String>();
    }

    //Getter y Setters
    public String getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
