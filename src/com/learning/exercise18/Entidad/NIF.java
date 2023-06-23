package com.learning.exercise18.Entidad;

public class NIF {
    //Atributos
    private String stringNumeroDNI;
    private long numeroDNI;
    private String letra;

    //Constructor por defecto
    public NIF() {
    }

    //Getter y Setters
    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getStringNumeroDNI(){
        return stringNumeroDNI;
    }

    public void setStringNumeroDNI(String stringNumeroDNI){
        this.stringNumeroDNI = stringNumeroDNI;
    }
}
