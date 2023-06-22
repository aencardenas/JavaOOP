package com.learning.exercise16.Service;

import com.learning.exercise16.Entidad.Puntos;

import java.util.Scanner;

public class PuntosService {

    public Puntos crearPuntos(){
        Scanner input = new Scanner(System.in);
        Puntos puntos = new Puntos();

        System.out.println("Ingresa las coordenas x e y del primer punto: ");
        puntos.setX1(Integer.parseInt(input.nextLine()));
        puntos.setY1(Integer.parseInt(input.nextLine()));

        System.out.println("Ingresa las coordenas x e y del segundo punto: ");
        puntos.setX2(Integer.parseInt(input.nextLine()));
        puntos.setY2(Integer.parseInt(input.nextLine()));

        return puntos;
    }

    public double calcularDistancia(Puntos puntos){

        int diferenciaDeX = puntos.getX2() - puntos.getX1();
        int diferenciaDeY = puntos.getY2() - puntos.getY1();

        return Math.sqrt(Math.pow(diferenciaDeX,2) + Math.pow(diferenciaDeY,2));
    }
}
