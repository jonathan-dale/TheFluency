
class MarsRover {
	String status;
	int speed;
	float temperature;
	
	
	void temperatureCheck() {
		if (temperature < -80);
		status = " Returning home ";
		speed = 5;
		System.out.println(status + speed);
	}// end of temperatureCheck
	
	void checkAttributes() {
		System.out.println("Status is " + status);
		System.out.println("Speed is " + speed);
		System.out.println("Temperature is " + temperature);
	}// end of checkAttribues
	
	void communicateInfo() {
		for (int i= 0; i < 5; i++) {
			System.out.printf("Connection to data link failed " + i + " times, attempting again");
			System.out.println("Please wait while connection is established");
		}
		System.out.println("Connection status: succesfull");
		System.out.println("Sending uplink to master controll in Houston");
	}// end of communicateInfo
	
}// end of class MarsRover

class MarsApplication {
	public static void main(String[] args) {
	MarsRover horizon = new MarsRover();
	horizon.status = "Exploriong";
	horizon.speed = 2;
	horizon.temperature = -10;
	horizon.checkAttributes();
	System.out.println("Checking the temp");
	horizon.temperatureCheck();
	System.out.println("Checking Attributes");
	horizon.communicateInfo();
	
	MarsRover sprit = new MarsRover();
	sprit.status = "Waiting";
	sprit.speed = 0;
	sprit.temperature = -15;
	System.out.println("Checking the temperature ");
	sprit.temperatureCheck();
	System.out.println("Checking the attributes");
	sprit.checkAttributes();
	sprit.communicateInfo();
	
	
  }// end of main
}// end of class MarsApplication 