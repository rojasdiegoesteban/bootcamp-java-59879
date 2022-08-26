package com.educacionit.clase3;

/**
 * {@code Branching} contains examples about branching with break and continue statements
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 *
 * @author Jonathan Manera
 */
public class Branching {
    public static void main(String[] args) {

        /*
            Break statement
         */

        // encontrar el número 12 y mostrar el index

        int[] arrayOfInts = {
                32, 87, 3, 589,
                12, 1076, 2000,
                8, 622, 127
        };

        int searchfor = 12;

        boolean foundIt = false;

        int index;
        for (index = 0; index < arrayOfInts.length; index++) {
            if (arrayOfInts[index] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + index);
        } else {
            System.out.println(searchfor + " not in the array");
        }


        /*
            Branching with tags
         */

        int[][] matrixOfInts = new int[2][3];
        matrixOfInts[0][0] = 10;
        matrixOfInts[0][1] = 11;
        matrixOfInts[0][2] = 12;
        matrixOfInts[1][0] = 20;
        matrixOfInts[1][1] = 21;
        matrixOfInts[1][2] = 22;

        searchfor = 20;
        foundIt = false;

        int j = 0, i;

        search:
        for (i = 0; i < matrixOfInts.length; i++) {
            for (j = 0; j < matrixOfInts[i].length; j++) {
                if (matrixOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at [" + i + "][" + j + "]");
        } else {
            System.out.println(searchfor + " not in the array");
        }


        /*
            continue statement
         */

        String searchMe = "peter piper picked a peck of pickled peppers";
        int pCount = 0;

        for (char letter : searchMe.toCharArray()) {

            // interested only in p's
            if (letter != 'p') {
                continue;
            }
            // increment p count
            pCount++;
        }
        System.out.println("Found " + pCount + " p's in the string.");

    }
}
