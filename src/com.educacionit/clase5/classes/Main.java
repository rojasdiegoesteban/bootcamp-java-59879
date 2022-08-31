package com.educacionit.clase5.classes;

public class Main {

    public static void main(String[] args) {

        Auto vwGolf = new Auto();

        /*vwGolf.setColor("blanco");
        vwGolf.setMarca("VW");
        vwGolf.setModelo("Golf");
        vwGolf.setCantidadPuertas(4);
        vwGolf.setDescapotable(false);
        vwGolf.setDiesel(true);*/

        System.out.println("Mi auto es un " + vwGolf.getMarca()
                + " " + vwGolf.getModelo() + " " + vwGolf.getColor());

        vwGolf.setMarca("VW");
        vwGolf.setModelo("Golf");
        vwGolf.setColor("rojo");

        System.out.println("Mi auto es un " + vwGolf.getMarca()
                + " " + vwGolf.getModelo() + " " + vwGolf.getColor());
    }
}
