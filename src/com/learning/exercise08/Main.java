package com.learning.exercise08;

import com.learning.exercise08.Entidades.Cadena;
import com.learning.exercise08.Servicios.CadenaServicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CadenaServicios cs = new CadenaServicios();
        Cadena cadena = new Cadena();

        //Crear cadena
        System.out.println("Ingresa una frase: ");
        cadena.setFrase(input.nextLine());
        cadena.setLongitud(cadena.getFrase().length());

        //Metodo para mostrar las vocales
        cs.mostrarVocales(cadena);

        //Metodo para invertir la cadena
        cs.invertirFrase(cadena);
        System.out.println();

        //Metodo para saber cuantas veces se encuentra repetido un caracter
        System.out.println("Ingresa una letra para saber cuantas veces se encuentra repetida: ");
        cs.vecesRepetido(cadena, input.nextLine());
        System.out.println();

        //Metodo para comparar longitudes de cadenas
        System.out.println("Ingrese una nueva frase para comparar longitudes: ");
        cs.compararLongitud(cadena, input.nextLine());
        System.out.println();

        //Metodo para unir frases
        System.out.println("Ingrese una frase nueva para unirla con la original: ");
        cs.unirFrases(cadena, input.nextLine());
        System.out.println();

        //Metodo para reemplazar una letra
        System.out.println("Ingrese una letra para reemplazarla en la frase original: ");
        cs.reemplazarLetra(cadena, input.nextLine());

        //Metodo para saber si una letra se encuentra en la frase
        System.out.println("Ingrese una letra para buscar en la frase original: ");
        System.out.println(cs.contiene(cadena, input.nextLine()) ? "La letra si se encuentra" : "La letra no se encuentra");
    }
}
