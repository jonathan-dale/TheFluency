import java.util.Scanner;
public class calculatePi {
	public static void main(String[] args) {
		
		// pi = 4 - 4/3 + 4/5 - 4/7 + 4/11 - .... do it in code here
		
		final int a;
		double myPi = 4.0;
		double i = 3.0;
		System.out.println("Enter a number to calculate pi, the bigger the better"); 
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		while (i < a) {
			myPi = myPi - (4/i) + (4/(i+2));
			System.out.println(myPi);
			i +=4;
		}
		System.out.println("myPi is: " + myPi);
		System.out.println("pi is  : " + Math.PI);
		in.close();

	}// end of main
}
