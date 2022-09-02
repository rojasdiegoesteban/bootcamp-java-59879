package com.educacionit.clase5.classes;

public class Main {

    public static void main(String[] args) {

        Auto vwGolf = new Auto();

        /*
        vwGolf.setColor("blanco");
        vwGolf.setMarca("VW");
        vwGolf.setModelo("Golf");
        vwGolf.setCantidadPuertas(4);
        vwGolf.setDescapotable(false);
        vwGolf.setDiesel(true);
        */

        System.out.println("Mi auto es un " + vwGolf.getMarca()
                + " " + vwGolf.getModelo() + " " + vwGolf.getColor());

        vwGolf.setMarca("VW");
        vwGolf.setModelo("Golf");
        vwGolf.setColor("rojo");

        /*System.out.println("Mi auto es un " + vwGolf.getMarca()
                + " " + vwGolf.getModelo() + " " + vwGolf.getColor());*/

        Auto fiatChronos = new Auto("Azul", "Fiat",
                "Chronos", 5,
                false, false);

        /*
        fiatChronos.setColor("Azul");
        fiatChronos.setMarca("Fiat");
        fiatChronos.setModelo("Chronos");
        fiatChronos.setCantidadPuertas(5);
        fiatChronos.setDescapotable(false);
        fiatChronos.setDiesel(false);
        */

        fiatChronos.setColor("Rojo");

        /*System.out.println("Mi auto es un " + fiatChronos.getMarca()
                + " " + fiatChronos.getModelo() + " " + fiatChronos.getColor());*/



        Auto tesla = new Auto("Tesla", "X");

        System.out.println("Mi auto es un " + tesla.getMarca()
                + " " + tesla.getModelo() + " " + tesla.getColor()
                + ", cantidad de puertas " +  tesla.getCantidadPuertas());

        System.out.println("La velocidad de " + tesla.getMarca() +
            " es " + tesla.getVelocidad() + "km/h");

        tesla.acelerar();
        tesla.acelerar();
        tesla.acelerar();
        tesla.acelerar();
        tesla.acelerar();

        System.out.println("La velocidad de " + tesla.getMarca() +
                " es " + tesla.getVelocidad() + "km/h");

        tesla.frenar();

        System.out.println("La velocidad de " + tesla.getMarca() +
                " es " + tesla.getVelocidad() + "km/h");


        System.out.println("Posición de Cambio para " + tesla.getMarca() +
                " es " + tesla.getCambio());

        tesla.incrementarCambio();
        tesla.incrementarCambio();
        tesla.incrementarCambio();
        tesla.incrementarCambio();
        tesla.incrementarCambio();
        tesla.incrementarCambio();
        tesla.incrementarCambio();

        System.out.println("Posición de Cambio para " + tesla.getMarca() +
                " es " + tesla.getCambio());

        tesla.decrementarCambio();

        System.out.println("Posición de Cambio para " + tesla.getMarca() +
                " es " + tesla.getCambio());

        tesla.decrementarCambio();
        tesla.decrementarCambio();
        tesla.decrementarCambio();
        tesla.decrementarCambio();
        tesla.decrementarCambio();

        System.out.println("Posición de Cambio para " + tesla.getMarca() +
                " es " + tesla.getCambio());

        /*
            Equals
         */

        if(tesla.equals(fiatChronos)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        Auto tesla1 = new Auto("Tesla", "S");

        if(tesla.equals(tesla1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }


        if(tesla.equals("hola")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        /*
            instance of
         */

        Object string = "hola";
        Object auto = new Auto();

        if (string instanceof Auto) {
            System.out.println("string es del tipo Auto");
        } else {
            System.out.println("string es otra cosa");
        }

        if (auto instanceof Auto) {
            System.out.println("auto es del tipo Auto");
        } else {
            System.out.println("auto es otra cosa");
        }


    }
}
