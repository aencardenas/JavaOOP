package com.learning.exercise02;

import com.learning.exercise02.Entidad.Circunferencia;
import com.learning.exercise02.Servicio.CircunferenciaServicios;

public class Circulos {
    public static void main(String[] args) {
        CircunferenciaServicios cs = new CircunferenciaServicios();
        Circunferencia circulo = cs.crearCircunferencia();

        double areaDelCirculo = cs.area(circulo);
        double perimetroDelCirculo = cs.perimetro(circulo);

        System.out.println("El area del circulo es: " + areaDelCirculo);
        System.out.println("El perimetro del circulo es: " + perimetroDelCirculo);

    }
}
