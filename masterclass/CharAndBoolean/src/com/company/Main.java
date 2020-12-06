package com.company;

public class Main {

    public static void main(String[] args) {

        // Unicode assigns 4 digit letters and numbers to symbol's; Use the '\uXXXX'
        // Unicode value for 'D' is 0044 and for 'Copy Write symbol' is 00A9
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("myChar = 'D' = " + myChar);
        System.out.println("myUnicodeChar = \\u0044 = " + myUnicodeChar);
        char myCopyWrite = '\u00A9';
        System.out.println("myCopyWrite = \\u00A9 = " + myCopyWrite);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        boolean isCustomerOverTwentyOne = true;


    }
}
