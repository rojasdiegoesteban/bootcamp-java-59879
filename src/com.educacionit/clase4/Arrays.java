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
        float[] floatArray;
        boolean[] booleanArray;
        String[] stringArray;
        int anotherArray[]; // no se usa pero es válido

        // allocates memory for 10 integers
        anArray = new int[10]; // 320bit
        floatArray = new float[10];
        booleanArray = new boolean[10];
        stringArray = new String[10];

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
            int item = anArray[index];
            System.out.println("Element at index " + index + ": " + item);
        }

        for(int item : anArray) {
            System.out.println("Item :" + item);
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
            System.out.println("Element at index" + index + ": " + anArray1[index]);
        }

        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        String[] coloresPrimarios = {"amarillo", "rojo", "azul"};

        for (int index = 0; index < anArray2.length; index++) {
            System.out.println("Element at index" + index + ": " + anArray2[index]);
        }

        /*
            Multidimensional Arrays
        */
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {10, 11, 12, 13, 14, 15}
        };

        // accedo a los arrays internos
        int[] arr1 = matrix[0];
        int[] arr2 = matrix[1];

        // accedo a los items
        int a1 = matrix[0][0];
        int a2 = matrix[0][1];
        int a3 = matrix[0][2];
        System.out.println(a1);

        int b1 = matrix[1][0];
        int b2 = matrix[1][1];
        int b3 = matrix[1][2];
        System.out.println(b1);

        for (int i = 0; i < matrix.length; i++) { // va de 0 a 1
            for (int j = 0; j < matrix[i].length; j++) { // va de 0 a 6
                int item = matrix[i][j];
                System.out.println("Element at [" + i + "][" + j + "]: " + item);
            }
        }

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        // Ejercicio: encontrar todas las combinaciones
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 1; j++) {
                System.out.println(names[0][i] + names[1][j]);
            }
        }

        /*
            Coping Arrays

            System.arraycopy(arrSource, sourcePosition, arrDestination, destinationPosition, length)
        */

        String[] arrSource = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};
        int sourcePosition = 2;

        String[] arrDestination = new String[7];
        int destinationPosition = 0;

        System.arraycopy(arrSource, // array original
                sourcePosition, // desde donde voy a empezar a copiar en el array original
                arrDestination, // array de destino
                destinationPosition, // desde donde voy a empezar a insertar en el destino
                arrDestination.length // longitud del array de destino
        );

        /*
        "Cappuccino", "Corretto", "Cortado",
         "Doppio", "Espresso", "Frappucino", "Freddo"
         */
        for (String coffee : arrDestination) {
            System.out.println(coffee);
        }

    }
}
