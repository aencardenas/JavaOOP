package com.learning.exercise14.Servicio;

import com.learning.exercise14.Entidad.Movil;

import java.util.Scanner;

public class MovilService {

    public Movil cargarCelular(){
        Scanner input = new Scanner(System.in);
        Movil movil = new Movil();

        System.out.println("Ingresa la marca del movil: ");
        movil.setMarca(input.nextLine());

        System.out.println("Ingresa el precio del movil: ");
        movil.setPrecio(Integer.parseInt(input.nextLine()));

        System.out.println("Ingresa el modelo del movil: ");
        movil.setModelo(input.nextLine());

        System.out.println("Capacidad de memoria RAM en Gb: ");
        movil.setMemoriaRam(Integer.parseInt(input.nextLine()));

        System.out.println("Capacidad de almacenamiento en Gb: ");
        movil.setAlmacenamietno(Integer.parseInt(input.nextLine()));

        System.out.println("Ingresar codigo por digito: ");
        ingresarCodigo(movil);

        return movil;

    }

    private void ingresarCodigo(Movil movil){
        Scanner input = new Scanner(System.in);
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            int digitosCodigo = Integer.parseInt(input.nextLine());
            codigo[i] = digitosCodigo;
        }
        movil.setCodigo(codigo);
    }

    public void mostrarMovil(Movil movil){
        System.out.println(movil.toString());
    }
}
