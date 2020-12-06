import java.util.Scanner;

public class Lottery {
	public static void main(String[] arg) {
		
		
		/*Still not working, need to look up the formula for this to work
		 * 
		 * It returns 1.0 for all values then a different value for chance at the end! 
		 */

		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers can you pick");
		int k = in.nextInt();
		System.out.println(k + " Out of how may total numbers?");
		int n = in.nextInt();
		Chance(k, n);

		in.close();
	}// end of main

	static void Chance(int k, int n) {
		double c = 0.0;

		for (int i = 1; i < n; i++) {
			for (int j = k; j > 0; j--) {
				c = (n - 1 + 1) / k;
				System.out.println(c);
			}
		}
		System.out.println("Your chances are " + c + " of winning, Good luck");

	}// end of Chance method
}
