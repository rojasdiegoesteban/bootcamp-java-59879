package com.educacionit.clase5;

/**
 * {@code Functions} contains examples about methods and functions in Java
 *
 * @author Jonathan Manera
 */
public class Functions {

    public static void main(String[] args) {

        /*
            Function with arguments and return
         */

        String operation;

        int num1 = 8, num2 = 2;

        operation = "add";
        System.out.println(operation + " = " + applyOperation(num1, num2, operation));

        operation = "sub";
        System.out.println(operation + " = " + applyOperation(num1, num2, operation));

        operation = "mul";
        System.out.println(operation + " = " + applyOperation(num1, num2, operation));

        operation = "div";
        System.out.println(operation + " = " + applyOperation(num1, num2, operation));

        /*
            Function with no arguments and return
         */
        double avogadroConstant = avogadro();
        System.out.println("avogadro const is " + avogadroConstant);

        /*
            Function with arguments and no return (void)
         */
        printSquare(5);

    }

    /**
     * Function that applies an arithmetical operation given two numbers
     *
     * @param a         first argument
     * @param b         second argument
     * @param operation valid arguments: 'add', 'sub', 'mul', 'div'
     * @return response in double or error
     */
    // <modificador-acceso> <tipo-retorno> <nombre-func>(<arg0>, <arg1>, ... <argN>)
    public static double applyOperation(double a, double b, String operation) {
        double response = 0;
        switch (operation.toUpperCase()) {
            case "ADD":
                response = a + b;
                break;
            case "SUB":
                response = a - b;
                break;
            case "MUL":
                response = a * b;
                break;
            case "DIV":
                response = a / b;
                break;
            default:
                System.err.println("Operation " + operation + " invalid");
        }
        return response;
    }

    /**
     * Function that return Avogadro’s number (number of particles in 1 mole)
     *
     * @return the avogadro constant (double)
     */
    public static double avogadro() {
        double exp = Math.pow(10, 23);
        return 6.02214076 * exp;
    }

    /**
     * Function that prints a square in the terminal
     *
     * @param size of the square
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < size; j++) {
                    if (j == 0 || j == size - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
