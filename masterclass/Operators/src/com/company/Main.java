package com.company;

import java.sql.SQLOutput;
import java.util.MissingFormatArgumentException;

public class Main {

    public static void main(String[] args) {

        // add and subtract
        System.out.println("--- addition and subtraction example");
        int result = 1 + 2; // resolves to 3,
        // We have two operators here '=' and '+' while the operands are '1' and '2'
        System.out.println("result of 1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result is = " + previousResult);
        result = result - 1; // result changed but not previousResult
        System.out.println("3 - 1 = " + result);
        System.out.println("result = " + result + " and previousResult = " + previousResult);

        // multiply
        System.out.println("--- multiplication example");
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // division
        System.out.println("--- division example");
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // modulus (mod %)
        System.out.println("--- modulus (%) example");
        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // the ++ operator
        System.out.println("--- ++ and -- operating");
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // the -- operator
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = "  + result);

        // more operators
        result +=2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -=2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);


        boolean isAlien = false;
        //if (! isAlien) // also works with !
        if (isAlien == false)
            System.out.println("It is not an alien");





    }
}
