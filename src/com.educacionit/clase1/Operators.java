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
        System.out.println(sum);

        var sub = num - 2;
        System.out.println(sub);

        var mul = num * 2;
        System.out.println(mul);

        var div = num / 2;
        System.out.println(div);

        var mod = num % 2;
        System.out.println(mod);


        /*
          Unary operators (-, ++, --, !)
        */
        var negative = -num;
        System.out.println(negative);

        num++; // num = num + 1;
        System.out.println(num);

        num--; // num = num - 1;
        System.out.println(num);

        boolean bool = true; // nor
        System.out.println(!bool);


        /*
          Assignment operators (=, +=, -=, *=, /=)
        */
        num = 4;
        System.out.println(num);

        num += 2; // num = num + 2;
        System.out.println(num);

        num -= 2; // num = num - 2;
        System.out.println(num);

        num *= 2; // num = num * 2;
        System.out.println(num);

        num /= 2; // num = num / 2;
        System.out.println(num);

        num %= 2;
        System.out.println(num);


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
        boolean b1 = true, b2 = false, b3 = true, b4 = false;

        System.out.println(b1 && b2); // false
        System.out.println(b1 && b3); // true

        //System.out.println(b1 || b2); // true
        //System.out.println(b1 || b3); // true


        /*
          Ternary operator (?:)
        */
        int a = 12, b = 11;

        var str = a < b ? "a is less than b" : "b is less than a";

        //System.out.println(str);

    }
}
