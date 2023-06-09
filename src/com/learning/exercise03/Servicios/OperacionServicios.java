package com.learning.exercise03.Servicios;

import com.learning.exercise03.Entidades.Operacion;

import java.util.Scanner;

public class OperacionServicios {

    //Metodo para ingresar los dos numeros y crear la operacion
    public Operacion crearOperacion(){
        Scanner input = new Scanner(System.in);
        Operacion numeros = new Operacion();

        System.out.println("Ingresa el primer numero: ");
        numeros.setPrimerNumero(input.nextInt());

        System.out.println("Ingresa el segundo numero: ");
        numeros.setSegundoNumero(input.nextInt());

        return numeros;
    }

    //Metodo para sumar
    public int sumar(Operacion numeros){
        return numeros.getPrimerNumero() + numeros.getSegundoNumero();
    }

    //Metodo para restar
    public int restar(Operacion numeros){
        return numeros.getPrimerNumero() - numeros.getSegundoNumero();
    }

    //Metodo para multiplicar
    public int multiplicar(Operacion numeros){
        if(numeros.getPrimerNumero()==0 || numeros.getSegundoNumero() == 0){
            System.out.println("Unos de los numeros es igual a 0");
            return 0;

        } else {

            return numeros.getPrimerNumero() * numeros.getSegundoNumero();
        }

    }

    //Metodo para dividir
    public int dividir(Operacion numeros){

        //Si el segundo numero (denominador) es 0 mostramos el error al usuario
        if(numeros.getSegundoNumero() == 0){
            System.out.println("No se puede dividir por 0");
            return 0;
        }

        return numeros.getPrimerNumero() / numeros.getSegundoNumero();
    }






}
