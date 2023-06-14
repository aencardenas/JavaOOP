package com.learning.exercise05.Servicios;

import com.learning.exercise05.Entidades.Cuenta;

import java.util.Scanner;

public class CuentaServicios {

    public Cuenta crearCuenta(){
        Scanner input = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        System.out.println("Ingresa el numero de cuenta: ");
        cuenta.setNumeroDeCuenta(input.nextInt());

        System.out.println("Ingrese su DNI: ");
        cuenta.setDNI(input.nextLong());

        System.out.println("Ingrese su saldo actual: ");
        cuenta.setSaldoActual(input.nextInt());

        return cuenta;

    }

    public void ingresarDinero(Cuenta cuenta){
        Scanner input = new Scanner(System.in);
        int sueldoActual = cuenta.getSaldoActual();

        System.out.println("Digita la cantidad de dinero a ingresar: ");
        cuenta.setSaldoActual(sueldoActual + input.nextInt());
    }

    public void retirarDinero(Cuenta cuenta){
        Scanner input = new Scanner(System.in);
        int saldoActual = cuenta.getSaldoActual();


        System.out.println("Digita la cantidad de dinero a retirar: ");
        int saldoRetirar = input.nextInt();

        if(saldoRetirar > saldoActual){
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(saldoActual - saldoRetirar);
        }

    }


    public void extraccionRapida(Cuenta cuenta){
        Scanner input = new Scanner(System.in);
        int saldoActual = cuenta.getSaldoActual();
        boolean band = false;
        System.out.println("Extraccion rapida (solo pouedes retirar el 20% de tu saldo actual)");

        do{
            if(saldoActual == 0){
                System.out.println("Ingresos insuficientes");
                break;
            }

            int saldoRetirar = input.nextInt();
            if((saldoRetirar == saldoActual * 0.20)){
                cuenta.setSaldoActual(saldoActual - saldoRetirar);
                band = true;
            } else{
                System.out.println("Solo puede retirar el 20% de su saldo actual");
            }

        }while(!band);
    }

    public void consultarSaldo(Cuenta cuenta){
        System.out.println("El saldo disponible es: " + cuenta.getSaldoActual());
    }

    public String consultarDatos(Cuenta cuenta){
        return cuenta.toString();
    }

}
