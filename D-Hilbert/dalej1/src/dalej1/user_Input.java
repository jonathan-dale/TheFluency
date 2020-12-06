package dalej1;

import java.util.Arrays;
import java.util.Scanner;

public class user_Input {
	public static void main(String args[]) {
		Scanner uInput = new Scanner(System.in);
		
		//allow user input to fill array
		
		System.out.println("How many numbers do you want to add?");
		
		int yourNumber = uInput.nextInt();
		int arrayOne[] = new int[yourNumber];
		
		
		System.out.println("Enter " + yourNumber + " numbers now");
		
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = uInput.nextInt();
		}
		
		// Lets sort the numbers in the array
		// The sort part is not working yet!
		
		/*for (int i = 0; i < arrayOne.length; i++) {
			if (arrayOne[i] > arrayOne[i +1]) {
				arrayOne[i + 1] = arrayOne[i];
			}
			
			 We need to check the list again to be sure the numbers are in order, still working!!!
		}
		
		// Now the elements have been  stored in the array
		*/
		System.out.println("The numbers you entered have ben stored and stored");
		System.out.println("These are the numbers you entered in accending order");
		printArray(arrayOne);
		
	uInput.close();	
	}
	
	//This method will print the array from above
	
	public static void printArray(int[] unSorted) {
		
		int[] sorted = new int[unSorted.length];
		Arrays.sort(unSorted);
		sorted = unSorted;
		int n = sorted.length;
		for (int i = 0; i < n; i++) {
			System.out.println(sorted[i] + " ");
			
			
		}
	} 

}
