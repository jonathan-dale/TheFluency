import java.util.Scanner;

public class UserInputLoops {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		String continueY =  "Y";
		int i = 1;
		while (continueY.equalsIgnoreCase("y")) {
			System.out.println(i);
			System.out.println("Do you want to continue? Enter y/n ");
			continueY = input.nextLine();
			i++;
			
		}
		System.out.println("Thanks for playing.");
		
	}// end of main
}
