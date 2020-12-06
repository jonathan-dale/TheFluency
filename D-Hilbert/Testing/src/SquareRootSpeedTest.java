import java.io.IOException;

public class SquareRootSpeedTest {

	public static void main(String[] args) throws IOException {
		
		boolean output = true;
		System.out.println("Do you want to have output on?");
		System.out.println("This will slow down the calculations");
		System.out.println("Turning off output is recommended");
		System.out.println("Enter y/n");
		//Scanner input = new Scanner(System.in);
		char g = (char) System.in.read();
		if (g == 'n') {
			output = false;
		}
		double factor = Math.random() / 2;
		long startTime = System.currentTimeMillis();
		
		//start calculating as many sqrt methods as you can in 60 seconds!
		for (int i = 0; i >= 0; i++)
		{
			double x = i * factor;
			double result = Math.sqrt(x);
			if (output) 
			{
				System.out.println("Math.sqrt(" + x + ") = " + result);
			}
			
			long checkTime = System.currentTimeMillis();
			long stopTime = checkTime - startTime;
			if (stopTime >= 600)
			{
				break;
			}
			System.out.println("I calculated " + i + "times");
			System.out.println(stopTime + " = " + checkTime + " - " + startTime);
			
		}// end for loop
		
		
		
	}// end main

}// end class SquareRootSpeedTest
