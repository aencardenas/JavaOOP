package com.learning.exercise22;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Meses meses = new Meses();
        String mesSecreto = meses.getMesSecreto();
        String mesUsuario;
        boolean mesEncontrado = false;
        
        do{
            System.out.println("Adivina el mes secreto: ");
            mesUsuario = sc.nextLine().toLowerCase();

            if (mesSecreto.equals(mesUsuario)){
                mesEncontrado = true;
            } else {
                System.out.println("Intentalo de nuevo: \n");
            }

        }while(!mesEncontrado);

        System.out.println("Felicidades ha acertado!");
    }
}
