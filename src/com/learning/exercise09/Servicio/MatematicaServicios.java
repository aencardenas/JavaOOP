package com.learning.exercise09.Servicio;

import com.learning.exercise09.Entidades.Matematica;

public class MatematicaServicios {

    public double devolverMayor(Matematica numeros){
        return numeros.getPrimerNumero() > numeros.getSegundoNumero() ? numeros.getPrimerNumero() : numeros.getSegundoNumero();
    }

    public double calcularPotencia(Matematica numeros){
        int primerNumero = (int) numeros.getPrimerNumero();
        int segundoNumero = (int) numeros.getSegundoNumero();

        return primerNumero > segundoNumero ? Math.pow(primerNumero,segundoNumero) : Math.pow(segundoNumero,primerNumero);
    }

    public double calcularRaiz(Matematica numeros){
        double primerNumero = Math.abs(numeros.getPrimerNumero());
        double segundoNumero = Math.abs(numeros.getSegundoNumero());
        return primerNumero < segundoNumero ? Math.sqrt(primerNumero) : Math.sqrt(segundoNumero);
    }


}
