package com.educacionit.clase11;

import com.educacionit.clase11.classes.Banco;

public class Main {
    public static void main(String[] args) {
        //Institucion institucionGenerica = new Institucion();
        Banco santader11 = new Banco("Colon 10", 50, "Santander suc. 10");
        Long cbuCliente1 = santader11.altaCuenta();
        System.out.println("Cbu Cliente 1: " + cbuCliente1);

        Long cbuCliente2 = santader11.altaCuenta();
        System.out.println("Cbu Cliente 2: " + cbuCliente2);

        Long cbuCliente3 = santader11.altaCuenta();
        System.out.println("Cbu Cliente 3: " + cbuCliente3);

        boolean seElimino = santader11.bajaCuenta(2L);
    }
}
