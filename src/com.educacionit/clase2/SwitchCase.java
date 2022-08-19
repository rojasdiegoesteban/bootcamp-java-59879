package com.educacionit.clase2;

/**
 * {@code SwitchCase} contains examples about switch-case clause
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
 *
 * @author Jonathan Manera
 */
public class SwitchCase {
    public static void main(String... args) {

        // basic switch

        var monthNumber = 100;
        String monthString;

        switch (monthNumber) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
        }
        System.out.println("Month = " + monthString);


        // switch using Strings

        monthNumber = 0;
        String month = "APRIL";

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
        }
        System.out.println("Month Num = " + monthNumber);


        // Ejercicio: evaluar el color del semaforo e imprimir un mensaje

        String color = "rojo";

        String message = "default";
        switch (color) {
            case "rojo":
                message = "frena!";
                break;
            case "verde":
                message = "pasa nomas";
                break;
            case "amarillo":
                message = "apurate o frena!";
        }
        System.out.println(message);


        // creative switch

        int switchNumVal = 7;

        switch (switchNumVal) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Three, four or five");
                System.out.println("Actually was a " + switchNumVal);
                break;
            default:
                System.out.println("it wasn't one, two, three, four or five...");
        }
    }
}
