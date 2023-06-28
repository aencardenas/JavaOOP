package com.learning.exercise19.Servicio;

import com.learning.exercise19.Entidad.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    private Ahorcado crearJuego(){
        Scanner input = new Scanner(System.in);
        Ahorcado ahorcado = new Ahorcado(); //Instanciar un objeto vacio

        //Llenando los atributos del objeto
        System.out.println("Ingaresa la palabra a buscar: ");
        String palabraString = input.nextLine();
        String[] palabraArray = palabraString.split("");
        ahorcado.setPalabra(palabraArray); //Guardando la palabra en el atributo del objeto

        System.out.println("Ingresa la cantidad de vidas: ");
        ahorcado.setVidas(Integer.parseInt(input.nextLine())); //Setear las vidad en 0
        ahorcado.setLetrasEncontradas(0); //Setear palabras encontradas en 0

        return ahorcado;

    }

    private void longitud(Ahorcado ahorcado){
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().length);
    }

    private void buscar(Ahorcado ahorcado,String letra){
        String[] palabra = ahorcado.getPalabra();
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)){
                System.out.println("Mensaje: La letra pertenece a la palabra" );
            }
        }
    }
}
