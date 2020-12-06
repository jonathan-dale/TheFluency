public class InsertionSort {


    public static void main(String[] args) {

        InsertionSort myInsertionSortObject = new InsertionSort();
        int[] myArray = myInsertionSortObject.generateArray();

        System.out.println();

        System.out.println("Before the sort the array looks like this: ");
        myInsertionSortObject.printArray(myArray);
        myInsertionSortObject.insertionSortMethod(myArray);
        System.out.println();
        System.out.println("After the sort the array looks like this: ");
        myInsertionSortObject.printArray(myArray);
    }


    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void insertionSortMethod(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int testValue = arr[i];
            int j;

            // 20 35 -15 7 55 1 -22
            for (j = i; j > 0 && arr[j-1] > testValue; j--) {
                arr[j] = arr[j-1];
            }

            arr[j] = testValue;
        }
    }


    public int[] generateArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*10)+10;
        }
        return array;
    }


    public int[] generateArray() {
        int number = 15;
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
        array[i] = (int)(Math.random()*10)+10;
        }
        return array;
    }


}
