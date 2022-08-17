package com.educacionit.clase2;

/**
 * {@code IfElse} contains examples about if-else clause
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
 *
 * @author Jonathan Manera
 */
public class IfElse {

    public static void main(String[] args) {

        /*
            if clause
        */
        int currentSpeed = 1;

        boolean isMoving = currentSpeed > 0, applyBrakes = true;

        // the "if" clause: bicycle must be moving AND apply brakes
        if (isMoving && applyBrakes) {
            // the "then" clause: decrease current speed
            currentSpeed--;
        }
        System.out.println("The bicycle speed is " + currentSpeed);


        /*
            if-else clause
        */
        isMoving = currentSpeed > 0;

        // the "if" clause: bicycle must be moving AND apply brakes
        if (isMoving && applyBrakes) {
            // the "then" clause: decrease current speed
            currentSpeed--;
            System.out.println("The bicycle speed is " + currentSpeed);
        } else {
            // the "else" clause: shows an alert message
            System.out.println("The bicycle has already stopped!");
        }

        /*
            nested if (if-else-if)
        */
        int testscore = 82;
        int grade;

        if (testscore == 100) {
            grade = 10;
        } else if (testscore >= 95) {
            grade = 9;
        } else if (testscore >= 90) {
            grade = 8;
        } else if (testscore >= 85) {
            grade = 7;
        } else if (testscore >= 80) {
            grade = 6;
        } else if (testscore >= 70) {
            grade = 5;
        } else if (testscore >= 60) {
            grade = 4;
        } else {
            grade = 2;
        }
        System.out.println("Grade = " + grade);

    }
}
