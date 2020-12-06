public class ArrayStructures {

    private int[] theArray = new int[1000];
    private int arraySize = 10;


    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public int[] getTheArray() {
        return theArray;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " | ");
        }
        System.out.println("----------");
    }

    // get value at index
    public int getValueAtIndex(int n) {
        if (n < arraySize) return theArray[n];
        return 0;
    }

    // check for a specific value
    public boolean hasThisValue(int value) {
        boolean foundValue = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                foundValue = true;
            }
        }
        return foundValue;
    }

    // add a new value to array
    public void addValue(int newValue) {
        if (arraySize < theArray.length) {
            theArray[arraySize] = newValue;
            arraySize++;
        }
    }


    public static void main(String[] args) {
        ArrayStructures myArray = new ArrayStructures();
        myArray.generateRandomArray();
        System.out.println("The array size is : " + myArray.getArraySize());
        myArray.printArray();
        System.out.println("Value at index 5 is : " + myArray.getValueAtIndex(5));
        System.out.println("Dose the array contain 25? " + myArray.hasThisValue(25));
        System.out.println("---------------------------");
        System.out.println("Dose the array contain 10? " + myArray.hasThisValue(10));
        System.out.println("----------------------------");
        System.out.println("Adding the value 55 to the array: ");
        myArray.addValue(55);
        System.out.println("Dose the array contain value 55? " + myArray.hasThisValue(55));
        System.out.println("The array size has now changed to " + myArray.getArraySize());


    }


}
