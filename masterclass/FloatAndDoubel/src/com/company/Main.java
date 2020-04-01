package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * Floating point numbers are not whole numbers like 3.14159...
         * Single/Double Precision: Precision refers to the space occupied by the type;
         *      Single takes 32 Bits and Double takes 64 Bits.
         * The Float has a range from 1.4E-45 to 3.4E+38
         * and the Double has a range from 4.9E-324 to 1.79E+308.
         * We can see that the Double is much more precise.
         */
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);


        int myIntVal = 5 / 2;
        float myFloatVal = 5f / 2f; // error with out 'f', can be casted as (float)
        double myDouble = 5d / 2d; // don't really need the trailing 'd'
        System.out.println("MyIntValue = " + myIntVal); // will not print remainder....
        System.out.println("MyFloatValue = " + myFloatVal); // notice we get decimal places when printing
        System.out.println("MyDoubleValue = " + myDouble);


        /**
         * Challenge: Convert an amount of pounds to kilograms.
         * Conversion --->  1 lb = 0.45359237 kg
         */

        int startingValue = 25;
        double lbToKg = 0.45359327;
        double kgToLb = 2.205;
        double valueInKg = startingValue * lbToKg;
        double valueInLbs = startingValue * kgToLb;
        System.out.println("Converting lbs to kgs ---> multiply by .45359327");
        System.out.println("25 lbs is = to " + valueInKg + " kg.");
        System.out.println("Converting kgs to lbs ---> multiply by 2.205");
        System.out.println("25 kgs is = to " + valueInLbs + " lbs");




    }
}
