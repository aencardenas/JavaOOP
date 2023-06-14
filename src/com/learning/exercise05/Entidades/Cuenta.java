package com.learning.exercise05.Entidades;

public class Cuenta {

    //Atributos
    private int numeroDeCuenta;
    private long DNI;
    private int saldoActual;

    //Constructor por defecto
    public Cuenta() {
    }

    //Constructor por parametros
    public Cuenta(int numeroDeCuenta, long DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    //Getters y Setters
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    //toString

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroDeCuenta=" + numeroDeCuenta +
                ", DNI=" + DNI +
                ", saldoActual=" + saldoActual +
                '}';
    }
}
