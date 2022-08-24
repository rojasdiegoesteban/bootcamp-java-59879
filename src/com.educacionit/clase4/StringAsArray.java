package com.educacionit.clase4;

/**
 * {@code StringAsArray} contains examples about {@link String}
 * <p>
 * Documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
 *
 * @author Jonathan Manera
 */
public class StringAsArray {
    public static void main(String[] args) {

         /*
            String str = "abc";

            is equivalent to...
        */

        char[] data = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);

        // toCharArray
        for (char ch : str.toCharArray()) {
            //System.out.println(ch);
        }

        // charAt
        char a = str.charAt(0);
        //System.out.println(a);

        char b = str.charAt(1);
        //System.out.println(b);

        char c = str.charAt(2);
        //System.out.println(c);

        // indexOf
        int indexOfA = str.indexOf('a');
        //System.out.println(indexOfA);

        int indexOfB = str.indexOf('b');
        //System.out.println(indexOfB);

        int indexOfC = str.indexOf('c');
        //System.out.println(indexOfC);

        // split
        String javaIsCool = "Java is cool";
        String[] split = javaIsCool.split(" ");
        for (String word : split) {
            //System.out.println(word);
        }

        String csv = "apple,fall,Newton,inspire,gravity theory";
        for (String word : csv.split(",")) {
            //System.out.println(word);
        }

    }

}
