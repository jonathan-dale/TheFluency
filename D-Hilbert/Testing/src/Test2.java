import java.util.*;
public class Test2 {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String name;
		int age;
		
		// Get some input form the user
		System.out.println("Waht is your name?");
		name = inp.next();
		System.out.println("What is your age?");
		age = inp.nextInt();
		System.out.println("Hello " + name + ", next year you will be " + (age +1) + " years old");
		
		// Works fine for only one name but errors when you add a last name. 
		
		inp.close();
	}// end of main

}
