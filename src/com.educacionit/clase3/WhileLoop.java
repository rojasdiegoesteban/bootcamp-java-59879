package com.educacionit.clase3;

/**
 * {@code WhileLoop} contains examples about while statement
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 *
 * @author Jonathan Manera
 */
public class WhileLoop {
    public static void main(String[] args) {

        /*
            while (expression) {
                statement(s)
            }
        */
        int count = 1;
        while (count < 11) {
            //System.out.println("Count is: " + count);
            count++;
        }

        /*
            Infinite loop with break
        */
        count = 1;
        while (true) {
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
        while (true) {
            if (count < 11) {
                //System.out.println("Count is: " + count);
                count++;
                continue;
            }
            break;
        }
    }
}
