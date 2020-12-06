package com.company;

public class Main {

    public static void main(String[] args) {

        /**
         * write a program that prints number from 1 to 100 on new lines.
         * For multiple of 3 print "fizz" instead of the number
         * For multiple of 5 print "buzz" instead of the number
         * For multiples of 3 and 5 print "FizzBuzz" instead of the number.
          */

        for (int i=1; i<100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");

            }
            else if (i % 3 == 0) {
                System.out.println("fizz");

            }
            else if (i % 5 == 0) {
                System.out.println("buzz");

            }
            else System.out.println(i);
        }

    }
}
