package com.learning.exercise23;


import com.learning.exercise23.Entidad.Ahorcado;
import com.learning.exercise23.Service.AhorcadoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado ahorcado = as.crearJuego();
        as.juego(ahorcado);
    }
}
