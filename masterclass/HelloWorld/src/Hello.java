public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNum = (10 + 5) + (2 * 10);
        int mySecondNum = 12;
        int myThirdNum = 5;
        int myFourthNum = myFirstNum;
        int myTotal = myFirstNum + mySecondNum + myThirdNum;
        int myNewTotal = myFourthNum + myTotal;

        System.out.println("myFirstNum = " + myFirstNum);
        System.out.println("mySecondNum = " + mySecondNum);
        System.out.println("myThirdNum = " + myThirdNum);
        System.out.println("myFourthNum = " + myFourthNum);
        System.out.println("myTotal = myFirstNum + mySecondNum + myThirdNum = " + myTotal);
        System.out.println("myNewTotal = myFourthNum + myTotal = " + myNewTotal);

        //Challenge: create a new variable called myLastOne with value equal to 1000 less than myTotal with data type int.

        int myLastOne = 1000 - myTotal;
        System.out.println("myLastOne = " + myLastOne);


    }

}
