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
            System.out.println("Count is: " + count);
            count++;
        }

        /*
            Infinite loop with break
        */
        count = 1;
        while (true) {
            System.out.println("Count is: " + count);
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
                System.out.println("Count is: " + count);
                count++;
                // continua con el siguiente ciclo
                continue;
            }
            break;
        }

        // print the reverse number
        int numero = 123456;
        int invertido = 0;

        while (numero > 0) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        System.out.println("numero inverso " + invertido); // 654321
    }
}
