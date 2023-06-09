package com.learning.exercise04.Servicios;

import com.learning.exercise04.Entidades.Rectangulo;

import java.util.Scanner;

public class RectanguloServicios {
    public Rectangulo crearRectangulo(){
        Scanner input = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingresa la medida de la base del rectangulo: ");
        rectangulo.setBase(input.nextInt());

        System.out.println("Ingresa la medida de la altura del rectangulo: ");
        rectangulo.setAltura(input.nextInt());

        return rectangulo;
    }

    public double superficie(Rectangulo rectangulo){
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    public double perimetro(Rectangulo rectangulo){
        return (rectangulo.getBase() + rectangulo.getAltura()) * 2;
    }

    public void dibujarRectangulo(Rectangulo rectangulo){
        int altura = rectangulo.getAltura();
        int base = rectangulo.getBase();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                boolean esBorde = (j == 0 || j == base - 1) || (i == 0 || i == altura - 1);
                System.out.print( esBorde ? "* " : "  ");
            }

            System.out.println();
        }


        }
    }



