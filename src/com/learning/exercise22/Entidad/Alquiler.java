package com.learning.exercise22.Entidad;

import java.util.Date;

public class Alquiler {
    //Atributos
    private String nombre;
    private float precio;
    private Date fechaInicio;
    private Date fechaFin;

    //Constructor vacio
    public Alquiler() {
        precio = 10;
    }

    //Constructor por parametros
    public Alquiler(String nombre, float precio, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.precio = 10;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
