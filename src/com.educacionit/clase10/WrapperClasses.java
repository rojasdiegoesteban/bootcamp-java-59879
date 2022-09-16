package com.educacionit.clase10;

/**
 * {@code WrapperClasses} contains examples about Wrapped Classes
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html
 *
 * @author Jonathan Manera
 */
public class WrapperClasses {

    public static void main(String[] args) {

        /*
            Integer
         */

        Integer a = new Integer(10); // Deprecado

        Integer b = new Integer(12); // Deprecado
        Integer bValueOf = Integer.valueOf(12);

        Integer c = new Integer("10"); // Deprecado
        Integer cValueOf = Integer.valueOf("10");

        System.out.println("El valor de c = " + c.toString());

        int aPrimitivo = a.intValue();
        int bPrimitivo = b.intValue();

        Integer suma = Integer.valueOf(aPrimitivo + bPrimitivo);
        System.out.println("La suma de a + b = " + suma.toString());

        long aLongPrimitivo = a.longValue();
        float aFloatPrimitivo = a.floatValue();
        double aDoublePrimitivo = a.doubleValue();

        /*
               the value 0 if this Integer is equal to the argument Integer;
               a value less than 0 if this Integer is numerically less than the argument Integer;
               and a value greater than 0 if this Integer is numerically greater than the argument Integer (signed comparison).
         */

        // valores posibles {-1, 0, 1}
        int menor = a.compareTo(b); // -1
        System.out.println(menor);

        int mayor = b.compareTo(a); // 1
        System.out.println(mayor);

        int igual = bValueOf.compareTo(b); // 0
        System.out.println(igual);

        /*
            Long
         */

        Long d = Long.valueOf(10);
        Long e = Long.valueOf("10");

        /*
            Double
         */

        Double f = Double.valueOf(10);
        Double g = Double.valueOf("10");

        System.out.println(f);
        System.out.println(g);

        /*
            Boolean

            NOTA: Un objeto Boolean puede tener 3 valores:
                - true
                - false
                - null
         */

        Boolean verdadero = Boolean.TRUE;
        boolean verdaderoPrimitivo = verdadero.booleanValue();
        System.out.println("El valor verdadero es " + verdadero);

        Boolean falso = Boolean.FALSE;
        boolean falsoPrimitivo = falso.booleanValue();
        System.out.println("El valor falso es " + falso);

        Boolean niTrueNiFalse = null;

        // Hacer la lógica "null-safe"
        if (niTrueNiFalse != null) {
            if (niTrueNiFalse == true) {
                System.out.println("Verdadero");
            } else if (niTrueNiFalse == false) {
                System.out.println("Falso");
            }
        }

        /*
            Character
         */
        Character ch = Character.valueOf('c');

        String chSrt = ch.toString();
        System.out.println("Conversión de char a string: " + chSrt);

        Character strCh = chSrt.charAt(0);
        System.out.println("Conversión de string a char: " + strCh);

    }
}
