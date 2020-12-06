package dalej1;
import java.util.Scanner;
public class Factorial2 {
	public static void main(String args[]) {	
		System.out.println("Enter the number that you want me to operate on.");
		System.out.println("The value must be an integer");
		Scanner operate = new Scanner(System.in);
		
		
		
		int fiv = operate.nextInt();
		
		// Lets give some conditions on the kind of input the user can enter
		// Block any number greater than 100
		
		while ( fiv >= 100) {
			System.out.println("This number is too big, try again");
			fiv = operate.nextInt();
		}
			System.out.println("The operation will result in" + operate(fiv));
				operate.close();
				
	}
	
	
	/*Add some random math operations
	The ranges are: 0 to 10; 11 to 51; 52 to 65; and 65 to max.
	Each range gets some math operation performed on it then returns the new result.
	*/
	
	public static int operate(int n) {
		
		int output = n;
		
		if (output >= 0 && output <= 10) {
			output = output * 10;
		} else
			if (output >= 11 || output <= 51) {
				return output * 2;
			} else 
				if (output >= 52 || output <= 65) {
					return output + 10; 
				} else
		return output;
		return output;
	}
	
}

		