package com.learning.exercise21.Entidad;

public class Tablero {

    //Atributos
    private int x;
    private int y;

    //Constructor por parametros
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters y Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
