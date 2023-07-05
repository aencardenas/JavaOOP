package com.learning.exercise22.Servicio;

import com.learning.exercise22.Entidad.Alquiler;
import com.learning.exercise22.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AlquilerServicio {
    public Alquiler alquilerRealizado(Pelicula pelicula){
        Scanner sc = new Scanner(System.in);
        Alquiler alquiler = new Alquiler();
        Date fechaActual = new Date();


        alquiler.setFechaInicio(fechaActual);

        System.out.println("Ingresa el nombre de la pelicula: ");
        String titulo = sc.nextLine();
        Pelicula p = PeliculaServicio.buscarPelicula(titulo);

        System.out.println("Ingresar anio: ");
        String anio = sc.nextLine();

        System.out.println("Ingresar mes: ");
        String mes = sc.nextLine();

        System.out.println("Ingresar dia: ");
        String dia = sc.nextLine();

        //Variables para validar anio, mes y dia
        boolean isAnioValid = (anio.length()==4 && Integer.parseInt(anio)>=2023);
        boolean isMesValid = (Integer.parseInt(mes)>=1 || Integer.parseInt(mes)<=12);
        boolean isDiaValid = (Integer.parseInt(dia)>=1 || Integer.parseInt(dia)<=31);

        //Validando la fecha
        while(!isAnioValid && !isMesValid && !isDiaValid){

            System.out.println("Ingresa los datos correctos: ");

            System.out.println("Ingresar anio: ");
            anio = sc.nextLine();

            System.out.println("Ingresar mes: ");
            mes = sc.nextLine();

            System.out.println("Ingresar dia: ");
            dia = sc.nextLine();
        }

        Date fechaDevolucion = new Date((Integer.parseInt(anio)-1900), (Integer.parseInt(mes)-1), (Integer.parseInt(dia)));
        alquiler.setFechaFin(fechaDevolucion);

        return alquiler;

    }




}
