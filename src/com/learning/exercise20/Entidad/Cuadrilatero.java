package com.learning.exercise20.Entidad;

public class Cuadrilatero {
    //Atributos
    private float ladoUno;
    private float ladoDos;

    //Constructor vacio
    public Cuadrilatero() {
    }

    //Constructor cuadrilatero
    public Cuadrilatero(float ladoUno, float ladoDos) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    //Constructor cuadrado
    public Cuadrilatero(float ladoUno) {
        this.ladoUno = ladoDos = ladoUno;

    }

    //Getter y Setters
    public float getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(float ladoUno) {
        this.ladoUno = ladoUno;
    }

    public float getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(float ladoDos) {
        this.ladoDos = ladoDos;
    }
}
