package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE; // smallest allowed int value
        int myMaxIntValue = Integer.MAX_VALUE; // largest allowed int value

        System.out.println("----- Integer MIN and MAX values -----");
        System.out.println("Min Int Value = " + myMinIntValue);
        System.out.println("Max Int Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myTestVal = 2_147_483_647;// under score is also valid
        System.out.println("Test Value = 2_147_483_647 = " + myTestVal);

        System.out.println("----- Byte MIN and MAX values -----");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);


        System.out.println("----- Short MIN and MAX values -----");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);


        long myLongValue = 100L;
        System.out.println("----- Long MIN and MAX values -----");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        long myBigLongValue = 2_147_483_647_123L; //you need the "L" at the end.

        System.out.println("----- Casting examples -----");
        int myTotal = (myMinIntValue / 2); // no error with this

        //byte myNewByteValue = (myMinByteValue / 2);  // throws error
        byte myNewByte = (byte) (myMinByteValue / 2);  // casted as "(byte)" to fix error

        //Short myNewShort = (myMinShortValue / 2); // throws error
        Short myNewShort = (short) (myMinShortValue / 2); // casted as "(short)" to fix error


        /**
         * Challenge:
         * Create an int, byte, and short of any value.
         * Next create a Long and set it to value 50000 plus ten times the sum of the int, byte, and short.
         */
        int myChallengeInt = 100;
        byte myChallengeByte = 25;
        short myChallengeShort = 50;
        long myChallengeLong = 50000L + 10L * (myChallengeInt + myChallengeByte + myChallengeShort);
        System.out.println("Challenge values: ");
        System.out.println("myChallengeInt, myChallengeByte, and myChallengeShort = " + myChallengeInt + ", "
                + myChallengeByte + ", " + myChallengeShort);
        System.out.println("myChallengeLong = " + myChallengeLong);



    }
}
