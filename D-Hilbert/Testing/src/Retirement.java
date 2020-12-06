import java.util.*;
public class Retirement {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		String goValue = "y";
		while (goValue != "n"){
		System.out.println("How much do you need to retire?");
		double goal = inp.nextDouble();
		System.out.println("How much are you going to save each year?");
		double payment = inp.nextDouble();
		System.out.println("How much interest will you gain?");
		double rate = inp.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while (balance < goal)
		{
			balance += payment;
			double interest = rate * balance / 100;
			balance += interest;
			years++;
		}
		System.out.println("It will take you " + years + " to retire");
		System.out.println("And you will have $" + balance + " Dollars");	
		System.out.println("Do you want to compute one more time?");
		goValue = inp.next();
		
		}
	}

}
