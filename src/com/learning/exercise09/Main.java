package com.learning.exercise09;

import com.learning.exercise09.Entidades.Matematica;
import com.learning.exercise09.Servicio.MatematicaServicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatematicaServicios ms = new MatematicaServicios();
        Matematica numeros = new Matematica();

        numeros.setPrimerNumero(Math.random()*10);
        numeros.setSegundoNumero(Math.random()*10);

        System.out.println("Los nuemros son: " + numeros.getPrimerNumero() + " y "+ numeros.getSegundoNumero());
        System.out.println("El mayor de los numeros es: " + ms.devolverMayor(numeros));
        System.out.println("La potencia del numero mayor elevado al numero menor es: " + ms.calcularPotencia(numeros));
        System.out.println("La raiz del numero menor es: " + ms.calcularRaiz(numeros));

    }
}
