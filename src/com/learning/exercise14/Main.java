package com.learning.exercise14;

import com.learning.exercise14.Entidad.Movil;
import com.learning.exercise14.Servicio.MovilService;

public class Main {
    public static void main(String[] args) {
        MovilService ms = new MovilService();

        //Instanciar primer objeto
        Movil m1 = ms.cargarCelular();
        ms.mostrarMovil(m1);

        //Instanciar segundo objeto
        Movil m2 = ms.cargarCelular();
        System.out.println(m2.toString());
    }
}
