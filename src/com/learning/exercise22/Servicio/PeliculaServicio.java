package com.learning.exercise22.Servicio;

import com.learning.exercise22.Entidad.Alquiler;
import com.learning.exercise22.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {
    private static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public static Pelicula crearPelicula(){
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

        listaPeliculas.add(peli);
        return peli;
    }

    public static Pelicula buscarPelicula(String nombre){

        for (Pelicula peli: listaPeliculas) {

            if(peli.getTitulo().equalsIgnoreCase(nombre)){
                return peli;
            }
        }
        return null;
    }

}
