package com.educacionit.clase1;

/**
 * {@code DataTypes} contains examples about java data types
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 *
 * @author Jonathan Manera
 */
public class DataTypes {

    public static void main(String[] args) {

        // byte (8-bit)
        byte maxByte = 127;
        System.out.println(maxByte);

        byte minByte = -128;
        System.out.println(minByte);

        maxByte++; // overflow
        System.out.println(maxByte);

        minByte--; // underflow
        System.out.println(minByte);


        // short (16-bit)
        short maxShort = 32_767;
        System.out.println(maxShort);

        short minShort = -32_768;
        System.out.println(minShort);


        // int (32-bit)
        int maxInt = 2_147_483_647;
        System.out.println(maxInt);

        int minInt = -2_147_483_648;
        System.out.println(minInt);


        // long (64-bit)
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println(maxLong);

        long minLong = -9_223_372_036_854_775_808L;
        System.out.println(minLong);

        var myLong = 1L; // default is int, so we need to add as suffix 'L'
        System.out.println(myLong);


        // float (32-bit)
        float maxFloat = 3.4028235E+38f;
        System.out.println(maxFloat);

        float minFloat = 1.4E-45f;
        System.out.println(minFloat);

        var myFloat = 1.5f; // default is double, so we need to add as suffix 'f'
        System.out.println(myFloat);


        // double (64-bit)
        double maxDouble = 1.7976931348623157E+308;
        System.out.println(maxDouble);

        double minDouble = 4.9E-324;
        System.out.println(minDouble);

        var myDouble = 1.5; // default is double
        System.out.println(myDouble);


        // boolean (1-bit)
        boolean myTrue = true; // 1
        System.out.println(myTrue);

        boolean myFalse = false; // 0
        System.out.println(myFalse);


        // char (16-bit)
        // Unicode: https://unicode-table.com/en/
        char myA = 'A';
        System.out.println(myA);

        myA = 65;
        System.out.println(myA);

        myA = '\u0041';
        System.out.println(myA);
    }
}
