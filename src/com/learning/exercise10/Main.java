package com.learning.exercise10;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        llenarArregloA(arrayA);
        System.out.println("Array A: ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println();

        System.out.println("Array A ordenado: ");
        Arrays.sort(arrayA);
        System.out.println(Arrays.toString(arrayA));
        System.out.println();
        //Funcion para llenar el ArrayB
        llenarArregloB(arrayA,arrayB);

        //Mostrar los dos arreglos resultantes
        System.out.println("Array B: ");
        System.out.println(Arrays.toString(arrayB));
    }

    public static void llenarArregloA(double[] array){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
            for (int i = 0; i < array.length; i++) {
                array[i] = Double.parseDouble(decimalFormat.format(Math.random()*20));
            }
    }


    public static void llenarArregloB(double[] arrayA, double[] arrayB){
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = i <= 9 ? arrayA[i] : 0.5;
        }
    }
}
