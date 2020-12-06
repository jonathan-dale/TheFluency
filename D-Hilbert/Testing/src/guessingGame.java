import java.util.Scanner;
public class guessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean playAgain = (true);
		do {
			guessMyNumber();
			System.out.println("Do you want to play again?");
			playAgain = input.nextBoolean();
		} while (playAgain);
		System.out.println("Thanks for playing!");
		input.close();
	}// end of main
	
	static void guessMyNumber() {
		int myNum = (int)(100*Math.random() + 1);
		int guessCount = 0;
		int guessNum;
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your guess");
		guessNum = input1.nextInt();
		guessCount++;
		while (true) {
		if (guessNum == myNum) 
			System.out.println("You got my number! It was " + myNum + " It took " + guessCount + " tries");
		 break;
		 if (guessCount == 5)
			System.out.println("Game over!");
			System.out.println("My number was " + myNum);
		 break;
		 if (guessNum < myNum) 
			System.out.println("That is too low, try again.");
		 break;
		 if (guessNum > myNum) 
			System.out.println("That is too high, try again");
		
		input1.close();
	}// end of guessMyNumber method

} // end of guessingGame class
