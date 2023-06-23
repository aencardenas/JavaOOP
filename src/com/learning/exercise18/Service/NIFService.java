package com.learning.exercise18.Service;

import com.learning.exercise18.Entidad.NIF;

import java.util.Scanner;

public class NIFService {
    public NIF crearNIF(){
        Scanner input = new Scanner(System.in);
        NIF nif = new NIF();
        String[] letras = {"T","R","W","A","G","M","Y","F","P",
                           "D","X","B","N","J","Z","S","Q","V",
                           "H","L","C","K","E"};

        System.out.println("Ingresar DNI: ");
        nif.setStringNumeroDNI(input.nextLine());
        nif.setNumeroDNI(Long.parseLong(nif.getStringNumeroDNI()));

        int posicionLetra = (int)nif.getNumeroDNI()%23;
        nif.setLetra(letras[posicionLetra]);
        return nif;
    }

    public void mostrarNIF(NIF nif){
        System.out.println("El NIF completo es el siguiente: ");
        System.out.println(nif.getStringNumeroDNI()+"-"+nif.getLetra());
    }
}
