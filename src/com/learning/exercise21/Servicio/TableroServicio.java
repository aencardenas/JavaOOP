package com.learning.exercise21.Servicio;

import com.learning.exercise21.Entidad.Tablero;

import java.util.Scanner;

public class TableroServicio {
    Scanner input = new Scanner(System.in);

    public void moverArriba(Tablero tablero){
        int y = tablero.getY();
        tablero.setX(y + input.nextInt());
    }

    public void moverAbajo(Tablero tablero){
        int y = tablero.getY();
        tablero.setY(y - input.nextInt());
    }

    public void moverDerecha(Tablero tablero){
        int x = tablero.getX();
        tablero.setX(x + input.nextInt());
    }

    public void moverIzquierda(Tablero tablero){
        int x = tablero.getX();
        tablero.setX(x - input.nextInt());
    }
}
