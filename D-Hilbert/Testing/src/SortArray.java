import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		
		int[] array1 = {55,90,34,98,57,17,59,46,91,71,14,1};
		System.out.println("The original array :");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + ", ");
		}
		System.out.println();
		sort1(array1, array1.length);
		System.out.println("The sorted array :");
		for (int i = 0; i < array1.length; i++){
			System.out.print(array1[i] + ", ");
		}
		
	}
	
	public static void sort1(int[] cool, int n) {
		
		int i,j;
		for( i = 0; i < n; i++) {
			for (j = n - 1; j > i; j--) { 
				if ( cool[j] > cool[j - 1]) {
					int hold = cool[j];
					cool[j] = cool[j - 1];
					cool[j-1] = hold;
				}
			}
		}
	}
	
	
}
