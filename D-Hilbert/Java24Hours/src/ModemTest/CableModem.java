package ModemTest;

public class CableModem extends Modem {
	String method = "Cable connetion";
	
	public void connect() {
		System.out.println("Connection to the Internet...");
		System.out.println("Useing a " + method);
	}

}
