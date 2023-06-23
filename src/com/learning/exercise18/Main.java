package com.learning.exercise18;

import com.learning.exercise18.Entidad.NIF;
import com.learning.exercise18.Service.NIFService;

public class Main {
    public static void main(String[] args) {
        NIFService ns = new NIFService();
        NIF nif = ns.crearNIF();
        ns.mostrarNIF(nif);
    }
}
