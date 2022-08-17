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

        String myFirstName = "Jonathan";
        String myLastName = "Manera";
        System.out.println(myFirstName + " " + myLastName);

        System.out.println(myFirstName + 1);
        System.out.println(myFirstName + 1.0);
        System.out.println(myFirstName + false);
        System.out.println(myFirstName + 'A');

        String myNewVar = 1 + 2 + 3 + myFirstName;
        //String myNewVar = 1 + 2 + (3 + myFirstName);
        System.out.println(myNewVar);

        myString = myString.concat(" Welcome!").concat(" Bye!");
        //myString = myString + " Welcome!" + " Bye!";
        System.out.println(myString);

        // length
        String strLength = "1234567890";
        System.out.println(strLength.length());
        System.out.println(myString.length());

        // upper case
        System.out.println(myString.toUpperCase());

        // lower case
        System.out.println(myString.toLowerCase());

        // trim
        String str = "     hello guys    ";
        System.out.println(str);
        System.out.println(str.trim());


        String fName = "    John    ", lName = "    Doe     ";
        System.out.println(fName.trim() + lName.trim());
        System.out.println(   (fName + lName).trim()  );

        // substring
        String world = "Hello awesome world".substring(14);
        //String world = "Hello awesome world".substring(14, 19);
        System.out.println(world);

        String hello = "Hello awesome world".substring(0, 5);
        System.out.println(hello);

        String awesome = "Hello awesome world".substring(6, 13);
        System.out.println(awesome);

    }
}
