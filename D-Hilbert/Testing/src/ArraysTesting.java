
public class ArraysTesting {
	public static void main(String[] agrs) 
	{
		
		// this will print dashes on the screen, don't get carried away.
		int k =1;
		while (k < 50){ System.out.print('-');k++;}
		System.out.println();
		// Very simple array, declare it and name it, 
		// Then loop through giving values to the array elements.
		int[] array0 = new int[25];
		for (int i = 0; i < array0.length; i++)
		{ 
			array0[i] = i;
		
			System.out.print(array0[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		
		/*This will create a string array then fill it with values from 0 to array1.length
		 * then it will print the array in a grid lay out like 
		 * | 0 0 | 0 1 | 0 2 | 0 3 |......
		 * | 1 0 | 1 1 | 1 2 | 1 3 |.......
		 * | 2 0 | 2 1 | 2 2 | 2 3 |........ 
		 *  ....
		 *  ....
		 *  | 9 0 | 9 1 | 9 2 | 9 3 |.....
		 *  
		 */
		
		String [][] array1 = new String [10][10];
		
		for (int i = 0; i < array1.length; i++)
		{
			for (int j = 0; j < array1[i].length; j++)
			{
				array1[i][j] = i + " " + j; // fill the array with the values of i and j
			}
		}
		
		int g = 0;
		while(g<=51){System.out.print('-');
		g++;
		}
		System.out.println();
		
		for (int i =0; i < array1.length; i++)
		{
			for (int j = 0; j < array1[i].length; j++)
			{
				System.out.print('|' + " " + array1[i][j] + " " + '|');
				//System.out.print('|');
				
			}
			System.out.println(" ");
		}
		
		// this is where the string array printing stops 
		
		System.out.println(); // an extra line for good measure, then on to the next array...
		
		 int[] array2 = new int[20];
		for (int i = 0; i < array2.length; i++)
		{
			
			array2[i] = i;
			System.out.print(array2[i]);
			System.out.print('-'); // taking out the ln in println will make this more elegant 
			
		}
		System.out.println();
		k = 0;
		while (k < 100) { System.out.print('-'); k++; }
		
	}

}
