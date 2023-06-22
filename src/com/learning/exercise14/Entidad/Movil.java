package com.learning.exercise14.Entidad;

import java.util.Arrays;

public class Movil {
    //Atributos
    private String marca;
    private int precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamietno;
    private int[] codigo;

    //Constructor por defecto
    public Movil() {
        codigo = new int[7];
    }

    //Constructor por parametros
    public Movil(String marca, int precio, String modelo, int memoriaRam, int almacenamietno) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamietno = almacenamietno;
        this.codigo = new int[7];
    }

    //Getter y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamietno() {
        return almacenamietno;
    }

    public void setAlmacenamietno(int almacenamietno) {
        this.almacenamietno = almacenamietno;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", almacenamietno=" + almacenamietno +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}
