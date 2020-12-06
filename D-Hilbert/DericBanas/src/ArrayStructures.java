
public class ArrayStructures {
	private int[] theArray = new int[50]; // create a new array with 50 indexes
	private int arraySize = 10; // Elements in theArray
	// Fills the array with random values

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			// Random numbers form 10 through 19
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public int[] getTheArray() {
		return theArray;

	}

	public int getArraySize() {
		return arraySize;

	}

	// Prints the array on the screen in a grid form
	public void printArray() {
		System.out.println("--------------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("--------------------");
		}

	}

	// Gets value at provided index
	public int getValueAtIndex(int index) {
		if (index < arraySize)
			return theArray[index];
		return 0;
	}

	// Returns true if a value is in the Array
	public boolean doseArrayContainThisValue(int searchValue) {
		boolean valueInArray = false;
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == searchValue) {
				valueInArray = true;
			}
		}
		return valueInArray;
	}
	
	// Delete Array row for the index and move elements up
	public void deleteIndex(int index) {
		if(index < arraySize){
			// Overwrite the value for the supplied index
			// and then keep overwriting every index that follows
			// until you get to the last index in the array
			for (int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
	}
	
	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}
	
	// Linear search : Every index must be looked at
	public  String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexsWithValue = "";
		System.out.print("The vlaue was found in the following indixes: ");
		for (int i = 0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				System.out.println(i + " ");
				indexsWithValue+= i + ", ";
			}
		}
		if(!valueInArray) {
			indexsWithValue = "None";
			System.out.println(indexsWithValue);
		}
		System.out.println();
		return indexsWithValue;
	}
	
	// This bubble sort will sort everything form small to large
	public void bubbleSort() {
		// i starts at the end of the Array
		// As it is decremented all indexes greater 
		// than it are sorted
		for (int i = arraySize =1; i < 1; i--) {
			// the inner loop starts at the beginning of 
			// the array and compares each value next to each
			// other. If the value is greater then they are swapped.
			for (int j = 0; j < i; j++) {
				if(theArray[j] > theArray[j + 1]){
					swapValues(j, j+1);
				}
			}
		}
	}
	
	private void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] =temp;
	}
	public void binarySearch(int searchValue) {
		int lowIndex = 0; 
		int highIndex = arraySize -1;
		while (lowIndex < highIndex) {
			int middleIndex = (highIndex + lowIndex) /2;
			if (theArray[middleIndex] < searchValue) lowIndex = middleIndex +1;
			else if(theArray[middleIndex] > searchValue) highIndex = middleIndex -1;
			else {
				System.out.println("Found a match for " + searchValue + " at Index " +
						middleIndex);
				lowIndex = highIndex +1;
			}
				
		}
	}
		
	

	public static void main(String[] args) { 
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		newArray.deleteIndex(4);
		newArray.printArray();
		/* The following methods have been created 
		 * above and can be uncommented to test out 
		 * one at a time or however.
		 */
		//System.out.println(newArray.getValueAtIndex(3));
		//System.out.println(newArray.doseArrayContainThisValue(18));
		//newArray.deleteIndex(4);
		//newArray.printArray();
		//newArray.insertValue(55);
		//newArray.printArray();
		//newArray.binarySearchforValue(12);
		//newArray.linearSearchForValue(17);
	}
}



