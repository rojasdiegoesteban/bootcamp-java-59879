package com.educacionit.clase9;

import com.educacionit.clase9.classes.Avion;
import com.educacionit.clase9.classes.Dron;
import com.educacionit.clase9.classes.Jet;
import com.educacionit.clase9.enums.Color;
import com.educacionit.clase9.enums.DronSize;
import com.educacionit.clase9.enums.Propulsion;

public class Main {

    public static void main(String[] args) {

        // Las clases abstractas NO pueden ser instanciadas
        // Volador volador = new Volador();

        Avion avion = new Avion("Mi Avión", Propulsion.TURBINA, 30, 4);

        System.out.println(avion);
        avion.despegar();
        avion.aterrizar();
        avion.cargarCombustible(100.);

        Jet jet = new Jet("Mi Jet", Propulsion.TURBINA, 12, 2, 13, Color.NEGRO);
        System.out.println(jet);
        jet.despegar();
        jet.aterrizar();
        jet.cargarCombustible(100.);

        Dron dron = new Dron("Mi Dron", Propulsion.HELICE, 4, DronSize.SMALL);
        System.out.println(dron);
        dron.despegar();
        dron.aterrizar();

    }
}
