package com.learning.exercise12.Servicios;

import com.learning.exercise12.Entidad.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {

    public Persona crearPersona(){
        Scanner input = new Scanner(System.in);
        Persona p1 = new Persona();

        System.out.println("Ingresa tu nombre: ");
        p1.setNombre(input.nextLine());
        System.out.println();

        System.out.println("Ingresa el anio, mes y dia de tu nacimiento(aaaa/mm/dd): ");
        Date fechaDeNacimiento = new Date(input.nextInt() - 1900, input.nextInt() - 1, input.nextInt());

        p1.setFechaDeNacimiento(fechaDeNacimiento);

        return p1;
    }

    public void calcularEdad(Persona p1){
        Date fechaActual = new Date();

        boolean pasoLaFecha = (fechaActual.getDay() > p1.getFechaDeNacimiento().getDay()) &&
                (fechaActual.getMonth() >= p1.getFechaDeNacimiento().getMonth());

        int edad = fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();

        if (pasoLaFecha){
            System.out.println("La edad de " + p1.getNombre() + " es: " + (edad));
        } else {
            System.out.println("La edad de " + p1.getNombre() + " es: " + (edad-1));
        }
    }

    public boolean menorQue(Persona p1, int edadPersonaNueva){

        Date fechaActual = new Date();

        boolean pasoLaFechaPersona = (fechaActual.getDay() > p1.getFechaDeNacimiento().getDay()) &&
                (fechaActual.getMonth() >= p1.getFechaDeNacimiento().getMonth());

        int edad = fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();

        if (!pasoLaFechaPersona){
            edad = edad - 1;
        }

        return edad < edadPersonaNueva;
    }

    public void mostrarPersona(Persona p1){
        System.out.println(p1.toString());
    }
}
