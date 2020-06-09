public class SelectionSort {

    public int[] generateAndFillArray(int arraySize) {
        int[] myArray = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            myArray[i] = (int)(Math.random()*10)+10;
        }
        return myArray;
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public void selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndex = 0;
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (arr[largestIndex] < arr[j]) {
                    largestIndex = lastUnsortedIndex;
                }
            }

        }
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }







}
