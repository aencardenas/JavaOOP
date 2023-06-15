package com.learning.exercise11;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un dia: ");
        int dia = input.nextInt();
        System.out.println("Ingresa el mes: ");
        int mes = input.nextInt();
        System.out.println("Ingresa el anio: ");
        int anio = input.nextInt();

        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();

        int diferenciaDeAnios = fechaActual.getYear() - (fecha.getYear() - 1900);

        System.out.println();
        System.out.println("La diferencia de anios entre las fechas es: " + diferenciaDeAnios);
    }
}
