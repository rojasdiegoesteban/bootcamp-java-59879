package com.educacionit.clase4;

/**
 * {@code Arrays} contains examples about arrays in Java
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *
 * @author Jonathan Manera
 */
public class Arrays {
    public static void main(String[] args) {

        /*
            So far what we know...
        */

        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (int index = 0; index < anArray.length; index++) {
            System.out.println("Element at index" + index + ": " + anArray[index]);
        }

        /*
            Initializing Arrays
        */

        int[] anArray1 = new int[]{
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        for (int index = 0; index < anArray1.length; index++) {
            //System.out.println("Element at index" + index + ": " + anArray1[index]);
        }

        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        for (int index = 0; index < anArray2.length; index++) {
            //System.out.println("Element at index" + index + ": " + anArray2[index]);
        }

        /*
            Multidimensional Arrays
        */
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.println("Element at [" + i + "][" + j + "] :" +matrix[i][j]);
            }
        }

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        //System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        //System.out.println(names[0][2] + names[1][1]);

        /*
            Coping Arrays

            arraycopy(arrSource, sourcePosition, arrDestination, destinationPosition, length)
        */

        String[] arrSource = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};
        int sourcePosition = 2;

        String[] arrDestination = new String[7];
        int destinationPosition = 0;

        System.arraycopy(arrSource, sourcePosition, arrDestination, destinationPosition, arrDestination.length);

        for (String coffee : arrDestination) {
            //System.out.println(coffee);
        }

    }
}
