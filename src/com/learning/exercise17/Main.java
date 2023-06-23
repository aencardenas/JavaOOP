package com.learning.exercise17;

import com.learning.exercise17.Entidad.Raices;
import com.learning.exercise17.Servicio.RaicesService;

public class Main {
    public static void main(String[] args) {
        RaicesService rs = new RaicesService();
        Raices ecuacion = rs.crearEcuacion();

        System.out.println("Discriminante: " + rs.getDiscriminante(ecuacion));
        rs.calcular(ecuacion);

    }
}
