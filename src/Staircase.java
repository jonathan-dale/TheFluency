import java.util.Scanner;

public class Staircase {

    public static void staircase(int n) {
        int counter = 0;
        for (int i=0; i<n; i++) {
            while (counter < n-i) {
                System.out.print(" ");
                counter++;
            }
            if (counter == n-i) {
                for (int j=0; j<i; j++) {
                    System.out.print("#");
                }
                System.out.println();
                counter = 0;
            }
        }
        // print the last line
        for (int i=0; i<n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void reverseStaircase(int n) {

        System.out.println();

        int counter=0;
        for (int i=0; i<n; i++) {
            while (counter < n-i) {
                System.out.print("#");
                counter++;
            }
            if (counter == n-i) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                counter=0;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("This will print a staircase of '#' and then the reverse staircase");
        System.out.println();
        System.out.println();
        System.out.println("Enter the size of the staircase:");
        int n = scanner.nextInt();
        staircase(n);

        System.out.println();
        System.out.println("Enter the size of the reverse staircase:");
        int reverse = scanner.nextInt();
        reverseStaircase(reverse);

    }

}
