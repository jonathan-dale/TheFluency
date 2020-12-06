package dalej1;

import java.util.Scanner;

public class CheckTestScore {

	public static void main(String args[]) {


			System.out.println("enter your test score to see what your letter grade is:");
			System.out.println(" ");
			Scanner in = new Scanner(System.in);
			int testScore = in.nextInt();
			in.close();
			System.out.println(" ");
			System.out.println("Grade is " + getGrade(testScore));

		}
	

	public static String getGrade(int n) {
		String grade;

		if (n >= 90) {
			grade = "A";
		} else if (n >= 80) {
			grade = "B";
		} else if (n >= 70) {
			grade = "C";
		} else if (n >= 60) {
			grade = "D";
		} else
			grade = "F";
		return grade;
	}

}
