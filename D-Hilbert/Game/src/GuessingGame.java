import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("I thinking of a number from 1 to 100");
		System.out.println("Try to guess my number, you get 5 tries.");
		Boolean goAgain;
		do {
			guessingGame();    //call to guessing game method
			System.out.println("Do you want to try again?");
			System.out.println("Enter yes or no");
			Scanner in = new Scanner(System.in);
			goAgain = in.nextBoolean();
			in.close();
		} while (goAgain);
		System.out.println("Thanks for palying");
	} // end of main
	
	
	public static void guessingGame() {
		int myNumber;
		int guessNumber;
		int counter = 0;
		myNumber = (int)(Math.random()*100 + 1); // randomly chosen integer
		guessNumber = 0;
		System.out.println("Enter a guess");
		Scanner in = new Scanner(System.in);
		while (true) {
			guessNumber = in.nextInt();
			counter++;
			if (guessNumber == myNumber) {
				System.out.println("You got my number in " + counter + "Gueses");
				System.out.println("My number was " + myNumber);
				break;
			}
			if (counter == 5) {
				System.out.println("You did not guess my number");
				System.out.println("My number was " + myNumber);
				break;
			}
			if (guessNumber < myNumber) {
				System.out.println("You are too low, try again:");
				break;
			} 
			else if (guessNumber > myNumber) {
				System.out.println("You are too high, try again:");
				break;
			}
			
		} //end while loop
		in.close();
	} // end guessingGame method
	
} //end guessingGame class
