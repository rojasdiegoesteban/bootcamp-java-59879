package com.educacionit.clase10;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*List<Integer> lst = new ArrayList<>(5);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5); */

        List<Integer> lst = List.of(1, 2, 3, 4, 5);

        InmutableClass inmutable = new InmutableClass(1, "inmutable", lst);

        List<Integer> otraLista = inmutable.getValues();
        otraLista.remove(0);
        otraLista.remove(0);
        otraLista.add(6);
        otraLista.add(7);

        for (Integer i : inmutable.getValues()) {
            System.out.println(i);
        }
    }
}
