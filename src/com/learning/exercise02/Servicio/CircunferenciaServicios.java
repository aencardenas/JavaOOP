package com.learning.exercise02.Servicio;

import com.learning.exercise02.Entidad.Circunferencia;

import java.util.Scanner;

public class CircunferenciaServicios {

    //Metodo para crear una circunferencia
    public Circunferencia crearCircunferencia(){
        Scanner input = new Scanner(System.in);
        Circunferencia circulo = new Circunferencia();

        System.out.println("Ingresa el radio de la circunferencia: ");
        circulo.setRadio(input.nextDouble());

        return circulo;
    }

    //Metodo para calcular el area del circulo
    public double area(Circunferencia circulo){
        double areaDelCirculo = Math.PI * Math.pow(circulo.getRadio(), 2);
        return areaDelCirculo;
    }

    //Metodo para calcular el perimetro del circulo
    public double perimetro(Circunferencia circulo){
        double perimetro = 2 * Math.PI * circulo.getRadio();
        return perimetro;
    }
}
