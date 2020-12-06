import java.util.Scanner;
/* This will run both lines at the same time, not like in a UNIX script
 * where all the commands are executed in order one at a time. 
 * 
 * I do not know how to fix this yet!!!
 *  
 * 
 */
public class EnterTheCorrectType {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your favorite number: ");
		if (in.hasNextInt()) {
			int favNumber = in.nextInt();
			System.out.println("You entered " + favNumber);
			
			System.out.println(favNumber + " * " + favNumber + " = " + favNumber * favNumber);
			
			int favNum2 = favNumber * 2;
			System.out.println(favNumber + " *  2  = " + favNum2);
			
			int favNum3 = favNumber + 5;
			System.out.println(favNumber + " + 5 = " + favNum3);
			favNumber+= 1;
			System.out.println("Now the number is " + favNumber);
			favNumber++;
			System.out.println("Now the number is " + favNumber);
			favNumber*=2;
			System.out.println("Now the number is " + favNumber);
			
		} else System.out.println("Enter a number next time!");
		
		//System.out.println("Enter your favorite letter: ");
		
		if (in.hasNextLine()) {
			String favLetter = in.nextLine();
			System.out.println("You entered " + favLetter);
		}// else System.out.println("Enter a letter next time!");
		
		in.close();

	}// end of main
}
