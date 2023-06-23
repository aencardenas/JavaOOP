package com.learning.exercise17.Servicio;

import com.learning.exercise17.Entidad.Raices;

import java.util.Scanner;

public class RaicesService {

    public Raices crearEcuacion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes a, b y c de la ecuacion de 2do grado: ");
        Raices ecuacion = new Raices(input.nextInt(), input.nextInt(), input.nextInt());
        return ecuacion;
    }

    public double getDiscriminante(Raices ecuacion){
        return Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC());
    }

    public boolean tieneRaices(Raices ecuacion){
        double discriminante = getDiscriminante(ecuacion);
        return discriminante>=0 ? true : false;
    }

    public boolean tieneRaiz(Raices ecuacion){
        double discriminante = getDiscriminante(ecuacion);
        return discriminante == 0 ? true : false;
    }

    public void obtenerRaices(Raices ecuacion){
        int a = ecuacion.getA();
        int b = ecuacion.getB();
        double discriminante = getDiscriminante(ecuacion);

        if(tieneRaices(ecuacion)){
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Raices: " + "\n" + raiz1 + "\n" + raiz2);
        }

    }

    public void obtenerRaiz(Raices ecuacion){
        int a = ecuacion.getA();
        int b = ecuacion.getB();
        double discriminante = getDiscriminante(ecuacion);

        if (tieneRaiz(ecuacion)){
            double raiz = (-b + Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raiz: " + raiz);
        }
    }

    public void calcular(Raices ecuacion){

        if (tieneRaices(ecuacion)){
            obtenerRaices(ecuacion);
        }

        if (tieneRaiz(ecuacion)){
            obtenerRaiz(ecuacion);
        }

        if (tieneRaices(ecuacion) == false && tieneRaiz(ecuacion) == false){
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}
