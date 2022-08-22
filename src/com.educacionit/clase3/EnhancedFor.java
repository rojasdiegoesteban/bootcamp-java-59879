package com.educacionit.clase3;

/**
 * {@code WhileLoop} contains examples about enhanced for aka "for-each"
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
        int[] myArrayInt = new int[5];
        myArrayInt[0] = 1;
        myArrayInt[1] = 2;
        myArrayInt[2] = 3;
        myArrayInt[3] = 4;
        myArrayInt[4] = 5;

        System.out.println("array value=" + myArrayInt[0]);
        System.out.println("array value=" + myArrayInt[1]);
        System.out.println("array value=" + myArrayInt[2]);
        System.out.println("array value=" + myArrayInt[3]);
        System.out.println("array value=" + myArrayInt[4]);

        for (int i = 0; i < myArrayInt.length; i++) {
            //System.out.println("array value=" + myArrayInt[i]);
        }

        /*
            for(value: array) {
                statement(s)
            }
        */
        for (int value : myArrayInt) {
            //System.out.println("array value=" + value);
        }

        for (char letter : "Hello world!".toCharArray()) {
            //System.out.println(letter);
        }

    }
}
