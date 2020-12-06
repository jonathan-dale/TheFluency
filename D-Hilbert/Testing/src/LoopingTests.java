import java.util.Scanner;
public class LoopingTests {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Enter a number to display odd values up to that value: ");
		Scanner in = new Scanner(System.in);
		int userNumber = in.nextInt();
		System.out.println("1");

		while (i < userNumber) {

			if (i % 2 != 1) {
				i += 1;
				System.out.print(i + " ");
				//continue;
			}
			//System.out.println(i);  /// if we uncomment this line the loop will print out even values. 

			i++;
		}
		in.close();
	}// end of main
}
