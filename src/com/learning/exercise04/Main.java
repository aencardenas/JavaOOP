package com.learning.exercise04;

import com.learning.exercise04.Entidades.Rectangulo;
import com.learning.exercise04.Servicios.RectanguloServicios;

public class Main {
    public static void main(String[] args) {
        RectanguloServicios rs = new RectanguloServicios();
        Rectangulo primerRectangulo = rs.crearRectangulo();

        System.out.println("La supeficie del rectangulo es: " + rs.superficie(primerRectangulo));
        System.out.println("El perimetro del rectangulo es: " + rs.perimetro(primerRectangulo));
        System.out.println();

        rs.dibujarRectangulo(primerRectangulo);

    }
}
