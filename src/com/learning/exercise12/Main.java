package com.learning.exercise12;

import com.learning.exercise12.Entidad.Persona;
import com.learning.exercise12.Servicios.PersonaServicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonaServicios ps = new PersonaServicios();

        //Crear una instancia de la clase persona
        Persona p1 = ps.crearPersona();

        //Calcular la edad de la persona
        ps.calcularEdad(p1);

        //Comparar la edad de la persona con una nueva persona
        System.out.println("Ingresa la edad de otra persona");
        int edadPersonaNueva = Integer.parseInt(input.nextLine());
        boolean esMenor = ps.menorQue(p1,edadPersonaNueva);
        System.out.println(esMenor ? p1.getNombre() + " es menor" : p1.getNombre() + " es mayor");

        //Mostrar persona
        ps.mostrarPersona(p1);
    }
}
