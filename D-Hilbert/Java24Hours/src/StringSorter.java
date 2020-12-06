import java.util.*;

public class StringSorter {
	
	public static void main(String[] arg) {
		
		String[] names = { "Jonathan", "Andrew", "Karen", "Alivia", "Alison", "Michael", 
			          "Mathew", "Marryanne", "Joe", "Marilee", "Chris", "Joel", "Stephany"};
		
		System.out.println("The orighnal order: ");
		for  (int i =1; i < names.length; i++) {
			System.out.println( i + ": " + names[i]);
		}
		
		System.out.println();
		Arrays.sort(names);
		System.out.println("The new order :");
		for (int i = 1; i < names.length; i++) { 
			System.out.println(i +  ": " + names[i]);
		}
	}
}
