import java.util.Scanner;
public class guessingGame2 {
	
	static int randomValue;
	static Scanner inp = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(getRandomValue());
		
		int guessReturn = 1;
		int guess = 0;

		while (guessReturn != -1) {
			
			System.out.print("Guess a number between 0 and 25: ");
			guess = inp.nextInt();
			guessReturn = getUserGuess(guess);
			
		} 
		
		System.out.println("You got it! The number is " + randomValue);
		
	}// end of main

	
	
	public static int getRandomValue() {
		randomValue = (int)(Math.random()*25);
		return randomValue;
	}// end of getRandomValue
	
	
	public static int getUserGuess(int userGuess) {
		if (userGuess == randomValue) {
			return -1;
		} else {
			return userGuess;
		}
	}// end of getUserGuess

}
