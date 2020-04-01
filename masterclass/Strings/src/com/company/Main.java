package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a String";
        System.out.println("My string is equal to \"" + myString + "\" ");
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to \"" + myString + "\" ");
        System.out.println("Lets add the copy write symbol, \\u00A9 to the end");
        myString = myString + " \u00A9 2020 ";
        System.out.println("My string is equal to \"" + myString + "\" ");
        String numberString = "50.55";
        numberString = numberString + "49.45";
        System.out.println(numberString); // notice that string's do not add like numeric types, must be converted first
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // notice int data type is appended to a string data type.
        System.out.println("lastString is equal to " + lastString);
        double doubelNumber = 120.47d;
        lastString = lastString + doubelNumber; // double data type appended to a string also.
        System.out.println("lastString = " + lastString);

    }
}
