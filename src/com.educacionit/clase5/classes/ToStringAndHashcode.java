package com.educacionit.clase5.classes;

public class ToStringAndHashcode {
    public static void main(String[] args) {

        Auto tesla = new Auto("Tesla", "X");

        Auto fiat = new Auto("Fiat", "Chronos");
        Auto fiat1 = new Auto("Fiat", "Chronos");

        //com.educacionit.clase5.classes.Auto@3f0ee7cb
        System.out.println(tesla);
        //System.out.println(tesla.toString());

        //com.educacionit.clase5.classes.Auto@75bd9247
        System.out.println(fiat);
        //System.out.println(fiat.toString());

        System.out.println(tesla.hashCode());
        System.out.println(fiat.hashCode());
        System.out.println(fiat1.hashCode());

    }
}
