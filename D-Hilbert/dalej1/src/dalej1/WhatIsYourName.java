package dalej1;
import java.util.Scanner;

public class WhatIsYourName {
	public static void main(String args[]) {
		System.out.println("What is your name?");
		System.out.println("Type in name and press enter");
			Scanner in = new Scanner(System.in);
			String yourName = in.toString();
			
				System.out.println("Your name is " + yourName);
		
		in.close();
		
		
		
		
	}

}
