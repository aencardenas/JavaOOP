package com.learning.exercise20;

import com.learning.exercise20.Entidad.Cuadrilatero;
import com.learning.exercise20.Servicio.CuadrilateroServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CuadrilateroServicio cs = new CuadrilateroServicio();
        Cuadrilatero c1;

        System.out.println("Ingresa el lado uno del cuadrilatero: ");
        float lado1 = input.nextFloat();
        System.out.println("Ingresa el lado dos del cuadrilatero: ");
        float lado2 = input.nextFloat();

        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es: " + cs.getPerimetro(c1));
        System.out.println("El area es: " + cs.getArea(c1));
    }
}
