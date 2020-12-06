import java.util.Scanner;
import java.time.*;
public class Test_Frame_For_Code {
	public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	int month = date.getMonthValue();
	int today = date.getDayOfMonth();
	
	date = date.minusDays(today -1);
	DayOfWeek weekDay = date.getDayOfWeek();
	int value = weekDay.getValue();
	
	
	System.out.println("SUN MON TUE WED THUR FRI SAT ");
	for ( int  i = 0; i < value; i++) {
		
		
		
	}System.out.print("t" + value);
	
	//while (month == )
	
	
	}
}
