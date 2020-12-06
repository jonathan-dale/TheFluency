package dalej1;

import java.util.Scanner;

public class CountDown {
	public static void main(String args[]) {

		// Prompt user for the number of triangles to count down

		System.out.println("How many triangles do you want to display?");
		Scanner prompt = new Scanner(System.in);
		int inputOne = prompt.nextInt();
		prompt.close();

		// Put a limit of 50 on the input and check that this condition is met.
		// Also gives the user the option to quit now without running the rest
		// of the program

		if (inputOne >= 50) {
			System.out.println("This value is to big, chose a value less than 50; do you want to try again?");
			System.out.println("Enter y/n and press enter");
			Scanner choice = new Scanner(System.in);
			String vara = choice.toString();
			choice.close();

			if (vara != "y" || vara != "Y" || vara != "n" || vara != "N") { 
				System.out.println("Do you want to try a different value? Type y/n and press return to continue");
				Scanner in2 = new Scanner(System.in);
				vara = in2.toString();
				in2.close();
			} 

			if (vara == "y" || vara == "y") {

				System.out.println("Type your second choice and press enter ");
				Scanner in3 = new Scanner(System.in);
				int inputTwo = in3.nextInt();
				in3.close();
				inputTwo = inputOne;
			} else
				// If the user wishes to quit now exit the program
				System.out.println("The program is closing ");
			return;
		} else
		// Send the users choice into the triangle method
		trianglePrinter(inputOne);
	}

	public static void trianglePrinter(int n) {

		for (int i = n; i >= 0; i--) {

			for (int j = 1; j >= i; j++) {
				System.out.println("");
			}
			System.out.print(i + " ");

		}
	}
}
