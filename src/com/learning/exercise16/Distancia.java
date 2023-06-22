package com.learning.exercise16;

import com.learning.exercise16.Entidad.Puntos;
import com.learning.exercise16.Service.PuntosService;

public class Distancia {
    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        Puntos puntos = ps.crearPuntos();

        double distanciaEntrePuntos = ps.calcularDistancia(puntos);
        System.out.println("La distancia entre puntos es: " + distanciaEntrePuntos);
    }
}
