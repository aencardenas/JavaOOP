package com.learning.exercise06.Service;

import com.learning.exercise06.Entidad.Cafetera;

import java.util.Scanner;

public class CafeteraServicios {
    Scanner input = new Scanner(System.in);
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafetera, int capacidadTaza) {
        int capacidadActualCafetera = cafetera.getCapacidadActual();

        if (capacidadTaza < capacidadActualCafetera){
            cafetera.setCapacidadActual(capacidadActualCafetera - capacidadTaza);
            System.out.println("La taza se ha llenado");
        } else{
            int faltante = capacidadTaza - capacidadActualCafetera;
            cafetera.setCapacidadActual(0);
            System.out.println("La taza no se ha llenado, faltaron " + faltante + "ml");
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cafe) {
        int cantidadCafeNueva = cafetera.getCapacidadActual() + cafe;
        cafetera.setCapacidadActual(cantidadCafeNueva);
    }

}
