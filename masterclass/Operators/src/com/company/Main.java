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
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am scared of aliens");
        } // used a code block here so both print statements will execute when if test passes

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the top score!");
        }
        System.out.println("You did not get the top score!");


        int newTopScore = 80;
        if (newTopScore <= 100) {
            System.out.println("You got the new Top Score and it is less than 100!");
        }
        if (topScore > newTopScore && topScore < 101) {
            System.out.println("Top Score is greater than new Top Score and less than 100");
        }

        if ((topScore > 50) || (newTopScore  > 100)) {
            System.out.println("Either one or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }

        /**
         *  == Ternery operators ==
         *     ( short for if-than-else statement)
         */

        int ageOfClient = 21;
        boolean isOverEighteen = ageOfClient >= 18 ? true:false; // condition is (ageOfClient >= 18) and assigns true if condition is true or else false
        if (isOverEighteen)
            System.out.println("Over 18 is true");


        /**
         * Challenge
         */

        System.out.println("================ Challenge =======================================");
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double thirdValue = (firstValue + secondValue) * 100.00d;
        System.out.println("ThirdValue = " + thirdValue);
        double myRemander = thirdValue % 40.00d;
        boolean myBool = myRemander == 0 ? true:false;
        System.out.println("The value if myBool is true if myRemander = 0.0, and myRemander = " + myRemander);
        System.out.println("myBoole = " + myBool);
        if (! myBool) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("Did not get a remainder");
        }






    }
}
