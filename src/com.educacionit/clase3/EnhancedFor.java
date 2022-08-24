package com.educacionit.clase3;

/**
 * {@code EnhancedFor} contains examples about enhanced for, aka "for-each"
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 *
 * @author Jonathan Manera
 */
public class EnhancedFor {
    public static void main(String[] args) {

        /*
            Array
        */
        int[] myArrayInt = new int[5]; // necesito 5 posiciones

        //Las 5 posiciones tienen un index que va de 0-4
        myArrayInt[0] = 1;
        System.out.println("array value=" + myArrayInt[0]);

        myArrayInt[1] = 2;
        System.out.println("array value=" + myArrayInt[1]);

        myArrayInt[2] = 3;
        System.out.println("array value=" + myArrayInt[2]);

        myArrayInt[3] = 4;
        System.out.println("array value=" + myArrayInt[3]);

        myArrayInt[4] = 5;
        System.out.println("array value=" + myArrayInt[4]);

        long[] myArrayLong = new long[5];
        for (int index = 0; index < myArrayLong.length; index++) {
            int value = index + 1; // puede ser cualquier valor entero
            myArrayLong[index] = value; // como se asigna un valor al array
            System.out.println("array value=" +
                    myArrayLong[index] // como se recupera un valor del array
            );
        }

        /*
            for(value: array) {
                statement(s)
            }
        */

        /*
        for (int index = 0; index < myArrayInt.length; index++) {
            int value = myArrayInt[index];
            System.out.println("array value=" + value);
        }
        */
        for (int value : myArrayInt) {
            System.out.println("array value=" + value);
        }

        String str = "Hello world!";
        for (char letter : str.toCharArray()) {
            System.out.println(letter);
        }

    }
}
