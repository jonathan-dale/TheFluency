
public class AssendingArraySort {

	public static void main(String[] args) {
		int[] array2 = {83,26,55,75,32,76,2,553,1,7,23,7,423,7,453,23,7,87,34,33};
		sort2(array2, array2.length);
		
		for  ( int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
	}
	
	static void sort2(int[] cool2, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = k -1; j > i; j--) {
			  if (cool2[i] > cool2[i + 1]) {
				int skip = cool2[i];
				cool2[i + 1] = cool2[i];
				skip = cool2[i + 1];
			   }
			}
		}
	}

}
