package com.learning.exercise20.Servicio;

import com.learning.exercise20.Entidad.Cuadrilatero;

public class CuadrilateroServicio {

    public float getPerimetro(Cuadrilatero cuadrilatero){
        float perimetro = 2 * (cuadrilatero.getLadoUno() + cuadrilatero.getLadoDos());
        return perimetro;
    }

    public float getArea(Cuadrilatero cuadrilatero){
        float area = (cuadrilatero.getLadoUno() * cuadrilatero.getLadoDos());
        return area;
    }
}
