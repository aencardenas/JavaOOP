package com.learning.exercise01.Servicio;

import com.learning.exercise01.Entidad.Libro;

import java.util.Scanner;

public class LibroServicio {
    public Libro ingresarLibro(){

        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("Ingresa el ISBN del libro: ");
        libro.setISBN(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingresa el titulo del libro: ");
        libro.setTitulo(sc.nextLine());

        System.out.println("Ingresa el autor del libro: ");
        libro.setAutor(sc.nextLine());

        System.out.println("Ingresa el numero de paginas: ");
        libro.setNumeroDePaginas(Integer.parseInt(sc.nextLine()));
        return libro;

    }

    public void mostrarLibro (Libro libro){
        System.out.println("El ISBN del libro es: " + libro.getISBN());
        System.out.println("El titulo del libro es: " + libro.getTitulo());
        System.out.println("El autor del libro es: " + libro.getAutor());
        System.out.println("El numero de paginas es: " + libro.getNumeroDePaginas());
    }
}
