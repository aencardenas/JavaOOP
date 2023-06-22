package com.learning.exercise15.Entidad;

public class Cancion {

    //Atributos
    private String titulo;
    private String autor;

    //Constructor por defecto
    public Cancion() {
        titulo = "";
        autor = "";

    }

    //Constructor por parametros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getter y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

}
