package com.educacionit.clase1;

/**
 * {@code StringClass} contains examples about {@link String}
 * <p>
 * Documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
 *
 * @author Jonathan Manera
 */
public class StringClass {

    public static void main(String[] args) {

        String myString = "Hello world!";
        System.out.println(myString);

        // concatenation
        myString = myString + " I'm Jonathan!";
        System.out.println(myString);

        myString = myString.concat(" Welcome!");
        System.out.println(myString);

        // length
        System.out.println(myString.length());

        // upper case
        System.out.println(myString.toUpperCase());

        // lower case
        System.out.println(myString.toLowerCase());

        // trim
        String str = "     hello guys    ";
        System.out.println(str);
        System.out.println(str.trim());

        // substring
        String world = "Hello awesome world".substring(14);
        System.out.println(world);

        String hello = "Hello awesome world".substring(0, 6);
        System.out.println(hello);

        String awesome = "Hello awesome world".substring(6, 14);
        System.out.println(awesome);

    }
}
