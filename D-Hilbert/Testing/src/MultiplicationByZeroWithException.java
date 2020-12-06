import java.util.*;

public class MultiplicationByZeroWithException {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean govalue = true;
		//try {
			do {
				System.out.println("Enter the first number:");
				int a = in.nextInt();
				System.out.println("Enter the second number:");
				int b = in.nextInt();
				int ratio = quant(a, b);
				System.out.printf("The ratio of %d / %d = %d ", a, b, ratio);
				govalue = false;
				
				catch (ArithmetricException e) {
					System.err.printf("ArithetricException %s%n ", e);
				}
					
				
				
		} while (govalue); 
		//}
		
	}
	
	public static int quant(int top, int bottom) {
		int result = top / bottom;
		return result;
	}

}
