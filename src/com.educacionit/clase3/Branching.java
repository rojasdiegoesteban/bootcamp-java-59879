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

        int[] arrayOfInts = new int[5];
        arrayOfInts[0] = 10;
        arrayOfInts[1] = 11;
        arrayOfInts[2] = 12;
        arrayOfInts[3] = 13;
        arrayOfInts[4] = 14;

        int searchfor = 12;

        boolean foundIt = false;

        int i;
        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
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

        searchfor = 21;
        foundIt = false;

        int j = 0;

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
            //System.out.println("Found " + searchfor + " at [" + i + "][" + j + "]");
        } else {
            //System.out.println(searchfor + " not in the array");
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
        //System.out.println("Found " + pCount + " p's in the string.");

    }
}
