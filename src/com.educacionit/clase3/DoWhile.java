package com.educacionit.clase3;

/**
 * {@code WhileLoop} contains examples about do-while statement
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 *
 * @author Jonathan Manera
 */
public class DoWhile {
    public static void main(String[] args) {

        /*
            do {
                statement(s)
            } while (expression);
        */
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        /*
            Infinite loop with break
        */
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;

            // exit condition
            if (count >= 11) {
                break;
            }
        } while (true);

        /*
            Infinite loop with continue
        */
        count = 1;
        do {
            if (count < 11) {
                System.out.println("Count is: " + count);
                count++;
                continue;
            }
            break;
        } while (true);

        /*
            do-while vs while
        */
        boolean condition = false;

        while (condition) {
            System.out.println("printed inside while");
        }

        do {
            System.out.println("printed inside do-while");
        } while (condition);
    }

}
