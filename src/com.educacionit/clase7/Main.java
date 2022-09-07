package com.educacionit.clase7;

import com.educacionit.clase7.enums.ColoresDeVehiculo;
import com.educacionit.clase7.interfaces.Terreno;
import com.educacionit.clase7.interfaces.Vehiculo;
import com.educacionit.clase7.polimorfismo.Auto;
import com.educacionit.clase7.polimorfismo.Lancha;
import com.educacionit.clase7.polimorfismo.Motocicleta;

public class Main {

    public static void main(String[] args) {

        /*
            Enums
         */

        boolean trueValue = Boolean.TRUE;
        trueValue = true;

        boolean falseValue = Boolean.FALSE;
        falseValue = false;

        Auto autoRojo = null;

        ColoresDeVehiculo rojo = ColoresDeVehiculo.ROJO;
        ColoresDeVehiculo azulOscuro = ColoresDeVehiculo.AZUL_OSCURO;
        ColoresDeVehiculo verdeClaro = ColoresDeVehiculo.VERDE_CLARO;

        // Enum en estructuras condicionales

        if (rojo.equals(azulOscuro)) {
            System.out.println("Los colores son iguales");
        } else {
            System.out.println("Los colores NO son iguales");
        }

        switch (azulOscuro) {
            case ROJO:
                System.out.println("Este color es rojo");
                break;
            case NEGRO:
                System.out.println("Este color es negro");
                break;
            case BLANCO:
                System.out.println("Este color es blanco");
                break;
            case AZUL_OSCURO:
                System.out.println("Este color es azul oscuro");
                break;
            case VERDE_CLARO:
                System.out.println("Este color es verde claro");
                break;
        }

        // Enum en atributos de objeto

        autoRojo = new Auto();
        autoRojo.setColor(ColoresDeVehiculo.ROJO);

        ColoresDeVehiculo color = autoRojo.getColor();

        System.out.println(autoRojo.toString());

        //autoRojo.setColor("AZUL"); // error!!!
        autoRojo.setColor("AZUL_OSCURO");

        System.out.println(autoRojo.toString());

        /*
            Polimorfismo
         */

        Auto auto = new Auto("Fiat", "Chronos");

        Motocicleta moto = new Motocicleta("Yamaha", "Tornado", ColoresDeVehiculo.NEGRO);

        Lancha lancha = new Lancha(ColoresDeVehiculo.ROJO, "Argentina", 4, false);

        /*Vehiculo vehiculo1 = auto;
        Vehiculo vehiculo2 = lancha;

        vehiculo1.acelerar();
        vehiculo1.decrementarCambio();
        vehiculo1.incrementarCambio();

        Terreno terreno1 = auto;
        Terreno terreno2 = moto;*/


        invocarMetodosDeVehiculo(auto);

        invocarMetodosDeVehiculo(lancha);

        //invocarMetodosDeVehiculo(moto);

        invocarMetodosDeTerreno(auto);

        invocarMetodosDeTerreno(moto);

        //invocarMetodosDeTerreno(lancha);

        if(auto instanceof Vehiculo && auto instanceof Terreno) {
            System.out.println("Auto es un vehiculo y terreno.");
        }

        if(moto instanceof Vehiculo || moto instanceof Terreno) {
            System.out.println("Moto es un vehiculo o terreno, pero no los dos.");
        }

    }

    private static void invocarMetodosDeVehiculo(Vehiculo vehiculo) {
        vehiculo.acelerar();
        vehiculo.decrementarCambio();
        vehiculo.acelerar();
    }

    private static void invocarMetodosDeTerreno(Terreno terreno) {
        System.out.println("Cantidad de ruedas = " + terreno.getCantidadRuedas());
        System.out.println("Rodado = " + terreno.getRodado());
    }
}
