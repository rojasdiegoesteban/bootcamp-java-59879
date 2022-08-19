package com.educacionit.clase1;

/**
 * {@code Operators} contains examples about java operators
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 *
 * @author Jonathan Manera
 */
public class Operators {
    public static void main(String... args) {

        /*
          Arithmetical operators (+, -, *, /, %)
        */
        double num = 5;

        var sum = num + 2;
        //System.out.println(sum);

        var sub = num - 2;
        //System.out.println(sub);

        var mul = num * 2;
        //System.out.println(mul);

        var div = num / 2;
        //System.out.println(div);

        var mod = num % 2;
        //System.out.println(mod);


        /*
          Unary operators (-, ++, --, !)
        */
        var negative = -num;
        //System.out.println(negative);

        num++; // num = num + 1;
        //System.out.println(num);

        num--; // num = num - 1;
        //System.out.println(num);

        boolean bool = true; // nor
        boolean bool1 = false; // nor
        System.out.println( "nor=" +  !(bool || bool1)  );


        /*
          Assignment operators (=, +=, -=, *=, /=)
        */
        num = 4;
        //System.out.println(num);

        num += 2; // num = num + 2;
        //System.out.println(num);

        num -= 2; // num = num - 2;
        //System.out.println(num);

        num *= 2; // num = num * 2;
        //System.out.println(num);

        num /= 2; // num = num / 2;
        //System.out.println(num);

        num %= 2;
        //System.out.println(num);


        /*
          Relational operators (<, >, <=, >=) and Equality operators (==, !=)
        */
        int num1 = 2, num2 = 3, num3 = 2;
        boolean res;
        res = num1 < num2;
        System.out.println(res);

        res = num1 > num2;
        System.out.println(res);

        res = num1 <= num3;
        System.out.println(res);

        res = num1 >= num3;
        System.out.println(res);

        res = num1 == num3;
        System.out.println(res);

        res = num1 != num3;
        System.out.println(res);

        /*
          Logical operators (&&, ||)
        */
        boolean b1 = false, b2 = false, b3 = true, b4 = true;

        // AND
        System.out.println(b1 && b2); // false  AND false   : false
        System.out.println(b1 && b3); // false  AND true    : false
        System.out.println(b3 && b1); // true   AND false   : false
        System.out.println(b3 && b4); // true   AND true    : true

        // OR
        System.out.println(b1 || b2); // false  OR false   : false
        System.out.println(b1 || b3); // false  OR true    : true
        System.out.println(b3 || b1); // true   OR false   : true
        System.out.println(b3 || b4); // true   OR true    : true

        /*
          Ternary operator (?:)
        */
        int a = 12, b = 11;

        boolean isALessThanB = a < b;

        // variable = (true|false) ? valTrue : valDefault;
        String str = isALessThanB ? "A is less than B" : "B is less than A";

        System.out.println(str);

    }
}
