package dalej1;

public class SomeVariables {
	public static void main(String args[]) {

		accessVariables();
		innitializedValues();
	}
	
	public static void accessVariables() {
		int a, b;
		float c;
		String d;
		
		a = 1;
		b = 2;
		c = 12.5f;
		d = "Java code";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
	public static void innitializedValues() {
		int i = 0;
		double d = 0;
		float f = 1.01f; 
		String s = "Java String";
		
		System.out.println("The value of int is innitialized to " + i);
		System.out.println("The value of double is innitialized to " + d);
		System.out.println("The value of float is innitialized to " + f);
		System.out.println("The value of String is innitialized to " + s);

	}
}

