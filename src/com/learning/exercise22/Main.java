package com.learning.exercise22;

import com.learning.exercise22.Entidad.Pelicula;
import com.learning.exercise22.Servicio.AlquilerServicio;
import com.learning.exercise22.Servicio.PeliculaServicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeliculaServicio ps = new PeliculaServicio();
        AlquilerServicio as = new AlquilerServicio();
        Object pelicula[] = new Object[5];
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        int choice = 0;

        while(choice != 8){
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Lista de peliculas disponibles");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Lista de alquileres");
            System.out.println("5. Buscar peliculas por titulo");
            System.out.println("6. Buscar peliciulas por genero");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. Salir");
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    listaPeliculas.add(ps.crearPelicula());
                    break;
                case 2:
                    System.out.println(listaPeliculas.get(0).toString());
                    break;
            }
        }
    }
}
