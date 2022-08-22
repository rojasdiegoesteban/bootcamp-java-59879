package com.educacionit.clase3;

/**
 * {@code WhileLoop} contains examples about for statement
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 *
 * @author Jonathan Manera
 */
public class ForLoop {
    public static void main(String[] args) {
         /*
            for (initialization; termination; operation) {
                statement(s)
            }
        */
        for (int count = 1; count < 11; count++) {
            //System.out.println("Count is: " + count);
        }

        /*
            Infinite loop with break
        */
        int count = 1;
        for (; ; ) {
            //System.out.println("Count is: " + count);
            count++;

            // exit condition
            if (count >= 11) {
                break;
            }
        }

        /*
            Infinite loop with continue
        */
        count = 1;
        for (; ; ) {
            if (count < 11) {
                //System.out.println("Count is: " + count);
                count++;
                continue;
            }
            break;
        }

        /*
            Exercises
        */

        // print all the pow of 125 between 1 and 1M

        // print the reverse number

    }
}
