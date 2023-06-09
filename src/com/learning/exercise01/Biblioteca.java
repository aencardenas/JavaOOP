package com.learning.exercise01;

import com.learning.exercise01.Entidad.Libro;
import com.learning.exercise01.Servicio.LibroServicio;

public class Biblioteca {
    public static void main(String[] args) {

        LibroServicio ls = new LibroServicio();
        Libro libro = ls.ingresarLibro();

        System.out.println("Informacion del libro: ");
        ls.mostrarLibro(libro);

    }
}
