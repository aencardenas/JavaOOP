package com.learning.exercise22.Entidad;

import java.util.Date;

public class Pelicula {

    //Atributos
    private String titulo;
    private String genero;
    private int anio;
    private float duracion;
    private boolean disponibilidad;

    //Constructor vacio
    public Pelicula() {
    }

    //Constructor por parametros
    public Pelicula(String titulo, String genero, int anio, float duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                '}';
    }
}
