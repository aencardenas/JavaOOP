package com.learning.exercise13.Servicio;

import com.learning.exercise13.Entidad.Curso;

import java.util.Arrays;
import java.util.Scanner;

public class CursoServicios {

    public Curso crearCurso(){
        Scanner input = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Ingresa el nombre del curso: ");
        curso.setNombreCurso(input.nextLine());

        System.out.println("Ingresa la cantidad de horas por dia: ");
        curso.setCantidadHorasPorDia(Integer.parseInt(input.nextLine()));

        System.out.println("Ingresa la cantidad de dias por semana: ");
        curso.setCantidadDiasPorSemana(Integer.parseInt(input.nextLine()));

        System.out.println("Ingresa el turno (manana o tarde): ");
        curso.setTurno(input.nextLine());

        System.out.println("Ingresa el precio por hora: ");
        curso.setPrecioPorHora(Integer.parseInt(input.nextLine()));

        System.out.println("Ingresa el nombre de los alumnos");
        cargarAlumnos(curso);
        return curso;
    }

    private void cargarAlumnos(Curso curso){
        Scanner input = new Scanner(System.in);
        String[] alumnos = new String[5];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i+1) + ": ");
            String nombreAlumno = input.nextLine();
            alumnos[i] = nombreAlumno;
        }
        curso.setAlumnos(alumnos);
    }

    public void calcularGananciaSemanal(Curso curso){
        int gananciaSemanal = curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getCantidadDiasPorSemana()*curso.getAlumnos().length;
        System.out.println("La ganancia semanal es: " + gananciaSemanal);
    }
}
