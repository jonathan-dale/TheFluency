import java.util.Scanner;
public class Bonus {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter your sales to see your calculated preformance");
		int sales = inp.nextInt();
		int goal = 500;
		int bonus;
		
		// Three conditions here: sales can be double goal, > goal, .5 * goal, or not good enough.
		
		if (sales >= 2 * goal) {
			bonus = 1000;
			System.out.println("Excellent your bonus is $" + bonus);
		} else
			if (sales > goal) {
				bonus = 500;
				System.out.println("Good your bonus is $" + bonus);
		} else
			if (sales >= .5 * goal) { 
				bonus = 100;
				System.out.println("Satisfactory preformance your bonus is $" + bonus);
				
			} else
				System.out.println("Your Fired!");
		inp.close();
	}

}
