package com.educacionit.clase10;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code ArrayLists} contains examples about {@code List<E>} and {@code ArrayList<E>}
 * <p>
 * Documentation:
 * - https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * - https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 *
 * @author Jonathan Manera
 */
public class ArrayLists {

    public static void main(String[] args) {

        // instantiate
        // NOTA: cuando no le paso el tamaño me va a crear
        // un array de 10 posiciones.
        List<String> listaDeCompras = new ArrayList<>(); // constructor vacío


        // IMPORTANTE: si conozco el tamaño pasarselo en el constructor SIEMPRE
        // para cree el array directamente con ese tamaño y evitar que vaya copiando arrays
        // a medida que crece la lista.
        List<Integer> arrInteger = new ArrayList<>(100);

        // agregar
        listaDeCompras.add("leche descremada");
        listaDeCompras.add("tostadas");
        listaDeCompras.add("mermelada");
        listaDeCompras.add("café");

        // recorrer
        recorrerLista(listaDeCompras);

        // modificar
        int position = listaDeCompras.indexOf("leche descremada"); // obtener la posición

        listaDeCompras.set(position, "leche de almendras"); // para reemplazarlo

        // recorrer
        recorrerLista(listaDeCompras);

        // eliminar
        listaDeCompras.remove("leche de almendras");

        // recorrer
        recorrerLista(listaDeCompras);

        // validar si existe
        boolean exists = listaDeCompras.contains("leche de almendras");
        if (!exists) {
            System.out.println("el item no existe en la lista");
        }

    }

    static void recorrerLista(List<String> list) {
        System.out.println("---------");
        for (String item : list) {
            System.out.println("comprar " + item);
        }
    }
}
