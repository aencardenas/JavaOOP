package com.learning.exercise06;

import com.learning.exercise06.Entidad.Cafetera;
import com.learning.exercise06.Service.CafeteraServicios;

public class Starbucks {
    public static void main(String[] args) {
        CafeteraServicios cs = new CafeteraServicios();
        Cafetera cafetera = new Cafetera();

        //Llenar la cafetera
        cs.llenarCafetera(cafetera);

        //Servir una taza
        cs.servirTaza(cafetera,800);
        cs.servirTaza(cafetera,800);
        cs.servirTaza(cafetera,500);
        System.out.println();

        System.out.println("Llenamos la cafetera otra vez: ");
        //Llenar cafetera
        cs.llenarCafetera(cafetera);
        System.out.println(cafetera.getCapacidadActual() + "ml de cafe");
        System.out.println();

        System.out.println("Vaciamos la cafetera con el metodo");
        //Vaciar cafetera
        cs.vaciarCafetera(cafetera);
        System.out.println(cafetera.getCapacidadActual() + "ml de cafe");
        System.out.println();
        //Agregar cafe
        System.out.println("Agregamos cafe con el metodo agregar cafe");
        cs.agregarCafe(cafetera,1500);
        System.out.println("La nueva cantidadde cafe es " + cafetera.getCapacidadActual());
    }


}
