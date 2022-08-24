package com.educacionit.clase3;

/**
 * {@code ForLoop} contains examples about for statement
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
            System.out.println("Count is: " + count);
        }

        for (int i = 5, m = 9;
             i < 10 || m > 1;
             i++, m--) {
            System.out.println("i is " + i);
            System.out.println("m is " + m);
        }

        // potencia de 2 desde 2 a 16
        for (int result = 2; result <= 16; result *= 2) {
            System.out.println("Result is: " + result);
        }

        /*
            Infinite loop with break
        */
        for (int count = 1; ; count++) {
            // exit condition
            if (count >= 11) {
                break;
            }
            System.out.println("Count is: " + count);
        }

        /*
            Infinite loop with continue
        */

        for (int count = 1; ; count++) {
            if (count < 11) {
                System.out.println("Count is: " + count);
                continue;
            }
            break;
        }

        /*
            Exercises
        */

        // imprimir valores de la potencia de 125
        // con resultado acotado a < 100M
        for (int i = 125; i < 1_000_000_000; i *= 125) {
            System.out.println("result " + i);
        }

        // print the reverse number
        int invertido = 0;

        for (int numero = 123456; numero > 0; numero /= 10) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
        }
        System.out.println("numero inverso " + invertido); // 654321
    }
}
