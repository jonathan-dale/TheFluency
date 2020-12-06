
public class ArraysTesting1 {

	public static void main(String[] args) {

		int[] array3 = new int[50000];
		
		

		for (int i = 0; i < 60; i++) {

			long startTime = System.currentTimeMillis();
			
			for (int j = 0; j < array3.length; j++) {
				array3[j] = (int) (Math.random() * 100);
			}
			
			long finalTime = System.currentTimeMillis();
			long amount = finalTime - startTime;
			System.out.println(amount);

		}
		
	  }
		
	

}
