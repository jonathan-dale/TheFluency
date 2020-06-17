import java.util.function.DoubleToIntFunction;

public class SelectionSort {
    int arraySize;
    int[] myArray;
    private int capacity = 28;

    public SelectionSort() {
        this.arraySize = 10; //default size
        this.myArray = this.generateAndFillArray();
    }

    public SelectionSort(int size) {
        this.arraySize = size;
        this.myArray = this.generateAndFillArray(size);
    }


    public int[] generateAndFillArray(int arraySize) {
        int[] myArray = new int[arraySize];
        for(int i=0; i<arraySize; i++) {
            myArray[i] = (int)(Math.random()*10)+10;
        }
        return myArray;
    }

    public int[] generateAndFillArray() {
        int[] myArray = new int[arraySize];
        for(int i=0; i<myArray.length; i++) {
            myArray[i] = (int)(Math.random()*10)+10;
        }
        return myArray;
    }

    public void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int index=i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]<arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(arr, i, index);
            }
        }
    }


    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    // doubles value of integer 'capacity' using 'capacity <<= 1'
    public int newCapacity() {
        this.capacity <<= 1;
        return this.capacity;
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Selection sort");
        System.out.println();
        SelectionSort mySortObj = new SelectionSort(10);
        System.out.println("Before sorting the array: ");
        mySortObj.printArray(mySortObj.myArray);
        mySortObj.selectionSort(mySortObj.myArray);
        System.out.println();
        System.out.println("After sorting the array: ");
        mySortObj.printArray(mySortObj.myArray);
        System.out.println();


        // doubles value of integer 'capacity <<= 1'
        System.out.println("My capacity = " + mySortObj.capacity);
        mySortObj.newCapacity();
        System.out.println();
        System.out.println("My new capacity = " + mySortObj.capacity);

    }

}
