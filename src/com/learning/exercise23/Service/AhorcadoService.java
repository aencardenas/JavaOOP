package com.learning.exercise23.Service;

import com.learning.exercise23.Entidad.Ahorcado;

import java.util.*;

public class AhorcadoService {

    public Ahorcado crearJuego() {
        Scanner input = new Scanner(System.in);
        Ahorcado ahorcado = new Ahorcado();
        boolean palabraInvalida = true;
        String palabra = "";

        System.out.println("Ingresa la palabra a buscar: ");
        while (palabraInvalida) { //Validar que la palabra no contenga espacios
            palabra = input.nextLine().toUpperCase();
            if (palabra.contains(" ")) {
                palabraInvalida = true;
                System.out.println("Ingresa una palabra valida: ");
            } else {
                palabraInvalida = false;
            }
        }

        Ahorcado.arrayLetras = palabra.split(""); //Guardar las letras de la palabra en un array

        for (String letra: Ahorcado.arrayLetras) {
            Ahorcado.letrasEnLaPalabra.add(letra); //Guardar las letras en un set para eliminar letras repetidas
        }

        System.out.println("Ingresa la cantidad de vidas: "); //Pedir la cantidad de vidas al usuario
        ahorcado.setVidas(input.nextInt());

        return ahorcado;
    }

    private void adivinarPalabra(Ahorcado ahorcado){
        Scanner input = new Scanner(System.in);
        String[] letrasAdivinadas = new String[Ahorcado.arrayLetras.length];
        Set<String> letrasUsadas = new HashSet<String>();
        Arrays.fill(letrasAdivinadas,"_"); //Iniciar el array para visualizar la palabra con puros guiones "_"
        int vidaActual = ahorcado.getVidas();
        int i = 0;


        while(vidaActual>0){ //Adivinar la palabra hasta que no tengamos mas vidas
            System.out.println("Adivina una letra: "); //Pedir al usuario la letra que quiere adivinar
            mostrarPalabra(letrasAdivinadas); //Mostrar la palabra con las letras que iremos adivinando
            System.out.println("");
            String letraUsuario = input.nextLine().toUpperCase();
            letrasUsadas.add(letraUsuario); //Guardar las letras que ha usado el usuario

            boolean estaLetra = buscarLetra(letraUsuario);
            mostrarLetrasUsadas(letrasUsadas); //Mostrar las letras que ha usado el usuario

            if (estaLetra) {
                actualizarPalabra(letrasAdivinadas,letraUsuario);
                Ahorcado.letrasEnLaPalabra.remove(letraUsuario);
            } else {
                vidaActual -= 1;
                ahorcado.setVidas(vidaActual);
            }

            vidas(ahorcado);

            if (Ahorcado.letrasEnLaPalabra.size()==0){
                break;
            }

        }

        mostrarPalabra(letrasAdivinadas);
        if(vidaActual > 0){
            System.out.println("\nFelicidades has adivinado la palabra!");
        } else {
            System.out.println("\nNo has podido adivinar la palabra, intentalo de nuevo");
        }
    }

    private void mostrarPalabra(String[] arrayLetras){
        for (int i = 0; i < arrayLetras.length; i++) {
            System.out.print(arrayLetras[i] + " ");
        }
    }

    private boolean buscarLetra(String letraUsuario){
        if (Ahorcado.letrasEnLaPalabra.contains(letraUsuario)){
            System.out.println("Mensaje: La letra pertenece a la palabra");
            return true;
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra o ya la has buscado");
            return false;
        }
    }

    private void actualizarPalabra(String[] letrasAdivinadas, String letraUsuario){

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            if (Ahorcado.arrayLetras[i].equalsIgnoreCase(letraUsuario)){
                letrasAdivinadas[i] = letraUsuario;
            }
        }
    }

    private void vidas(Ahorcado ahorcado){
        System.out.println("Vidas: " + ahorcado.getVidas() + "\n");
    }

    private void mostrarLetrasUsadas(Set<String> letrasUsadas){
        String[] array = letrasUsadas.toArray(new String[0]);
        String setAsString = String.join("-",array);
        System.out.println("Letras usadas: " + setAsString);
    }

    public void juego(Ahorcado ahorcado){
        adivinarPalabra(ahorcado);

    }





}
