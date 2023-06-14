package com.learning.exercise05;

import com.learning.exercise05.Entidades.Cuenta;
import com.learning.exercise05.Servicios.CuentaServicios;

public class Bank {
    public static void main(String[] args) {
        CuentaServicios cs = new CuentaServicios();
        Cuenta cuenta = cs.crearCuenta();
        cs.ingresarDinero(cuenta);
        cs.retirarDinero(cuenta);
        cs.extraccionRapida(cuenta);
        cs.consultarSaldo(cuenta);
        System.out.println(cs.consultarDatos(cuenta));

    }
}
