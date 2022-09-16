package com.educacionit.clase10;

/**
 * {@code Boxing} contains examples about Autoboxing and Unboxing
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 *
 * @author Jonathan Manera
 */
public class Boxing {
    public static void main(String[] args) {

        /*
            Autoboxing
         */

        Long longObject;
        Double doubleObject;

        // This is what Autoboxing is about...
        long longPrimitivo = 54L;
        longObject = Long.valueOf(longPrimitivo);

        double doublePrimitivo = 54.01d;
        doubleObject = Double.valueOf(doublePrimitivo);


        /*
            Unboxing
         */

        // Is the inverse process...
        long unboxedLong = longObject.longValue();
        double unboxedDouble = doubleObject.doubleValue();


        /*
            Java hace el Autobox y el Unbox por nosotros
         */

        // Autoboxing
        Integer intObject = 54;
        longObject = 54L;
        doubleObject = 54.1d;

        // Unboxing
        int intPrimitivo = intObject;
        longPrimitivo = longObject;
        doublePrimitivo = doubleObject;

        // IMPORTANTE: Ser consciente de que por detrás JAVA está haciendo
        // lo mismo que nosotros al principio!
    }

}
