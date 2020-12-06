package dalej1;

public class Factorial {
	public static void main(String[] args) {
	final int NumBer = 25;
	for(int i = 1; i <= NumBer; i ++) {
		System.out.println(i + "! is = " + Send(i));
	}
	long var = 1;
	for(int i = 1; i <= NumBer; i++) {
		var *= i;
		System.out.println(var);
	}
	
	// This part is also not working after the number reaches 21. The output starts to get messy for values greter than this. 
	// Making output scientific notation should fix this.

}


public static long Send(int n) {
	
	long sendBack = 1;
	
	for(int i = 2; i <= n; i ++) {
		sendBack *= i;
		
	}
	
	return sendBack;
}
}