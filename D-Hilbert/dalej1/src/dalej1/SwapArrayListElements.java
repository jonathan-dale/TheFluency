package dalej1;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class SwapArrayListElements {
	public static void main(String args[]) {
		List<String> bigArray = new ArrayList<String>();
		Scanner usrInput = new Scanner(System.in);

		do {
			System.out.println("The list is " + bigArray);
			System.out.println("Do you wnat to add more ");
			System.out.println("y/n");
			if (usrInput.next().startsWith("y")) {
				System.out.println("Enter the next item");
				bigArray.add(usrInput.next());
			} else {
				break;
			}
		} while (true);

		System.out.println("List is " + bigArray);
		String[] arr = bigArray.toArray(new String[0]);
		System.out.println("Array is " + Arrays.toString(arr));
		usrInput.close();
	}// end of main

}// end of SwapArrayListElemets class
