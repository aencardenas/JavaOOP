package com.learning.exercise22.Servicio;

import com.learning.exercise22.Entidad.Alquiler;
import com.learning.exercise22.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    public Pelicula crearPelicula(){
        Scanner sc = new Scanner(System.in);
        Pelicula peli = new Pelicula();

        //Datos del objeto pelicula
        System.out.println("Ingresa el nombre de la pelicula: ");
        peli.setTitulo(sc.nextLine());

        System.out.println("Ingrese el genero de la pelicula: ");
        peli.setGenero(sc.nextLine());

        System.out.println("Ingrese el año de la pelicula: ");
        peli.setAnio(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese la duracion de la pelicula: ");
        peli.setDuracion(Float.parseFloat(sc.nextLine()));

        return peli;
    }

    public void buscarPelicula(ArrayList listaPeliculas, String nombre){

        for (Object peli: listaPeliculas) {

        }
    }

}
