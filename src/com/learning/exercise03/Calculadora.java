package com.learning.exercise03;

import com.learning.exercise03.Entidades.Operacion;
import com.learning.exercise03.Servicios.OperacionServicios;

public class Calculadora {
    public static void main(String[] args) {
        OperacionServicios opS = new OperacionServicios();
        Operacion primeraOperacion = opS.crearOperacion();

        System.out.println("La suma de los numeros es: " + opS.sumar(primeraOperacion));
        System.out.println("La resta de los numeros es: " + opS.restar(primeraOperacion));
        System.out.println("La multiplicacion de los numeros es: " + opS.multiplicar(primeraOperacion));
        System.out.println("La division de los numeros es: " + opS.dividir(primeraOperacion));
    }
}
