package ModemTest;

public class DSLModem extends Modem {
	String method = "DSL phone connection ";
	
	public void connect() {
		System.out.println("Connecting to the internet...");
		System.out.println("Useing a " + method);
	}

}
