package com.educacionit.clase1;

/**
 * {@code Syntax} contains examples about java syntax
 *
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 */
public class Syntax {

    /**
     * Main code block to be executed
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        /*
            Variable
        */
        var myVar = 0; // declaración
        myVar = 1; // asignación
        myVar = 2;
        myVar = 3 + 3;
        // myVar = "hola";

        System.out.println(myVar);

        var myHola = "hola";

        var somethingReallyImportant = "important"; // naming in lowerCamelCase
        somethingReallyImportant = "importante!";


        /*
            Constant
        */
        final var PI = 3.14;
        //PI = 3;


        /*
            Expressions vs Statements
        */

        myVar = 5; // statement

        //System.out.println("myVar=" + myVar);


        // start of statement
        myVar =
                2 + 2 // this is an expression
        ; // end of statement

        System.out.println(
                "myVar=" + myVar // this is also an expression
        );

        System.out.println(
                2 + 2 // this is also an expression
        );


        /*
            Code blocks
        */

        //var score = 700;
        {
            // This is inside the code block (block scope)
            var score = 800;
            System.out.printf("You score is %d\n", score);
        }
        // This is out of the code block (block scope)

        var score = 900;
        System.out.printf("You score is %d\n", score);

        score = 1000;
        System.out.printf("You score is %d\n", score);
    }
}
