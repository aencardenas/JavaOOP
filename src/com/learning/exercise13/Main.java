package com.learning.exercise13;

import com.learning.exercise13.Entidad.Curso;
import com.learning.exercise13.Servicio.CursoServicios;

public class Main {
    public static void main(String[] args) {
        CursoServicios cs = new CursoServicios();
        Curso curso = cs.crearCurso();
        cs.calcularGananciaSemanal(curso);



    }
}
