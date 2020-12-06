package ModemTest;

public class ModemTester {
	public static void main(String[] args) {
		CableModem surfBoard = new CableModem();//creating objects cable modem
		DSLModem gateway = new DSLModem();//creating object DSL modem
		surfBoard.speed = 50000;//set the value of Cable Modem speed to 50000
		gateway.speed = 40000;//set the value of Cable Modem speed to 40000
		System.out.println("Trying the cabel modem: ");
		surfBoard.displaySpeed();//call displaySpeed() method in the super class.
		surfBoard.connect();//calling this is also inherited method connect().
		System.out.println("Trying the DSL Modem: ");
		gateway.displaySpeed();
		gateway.connect();
	}

}
