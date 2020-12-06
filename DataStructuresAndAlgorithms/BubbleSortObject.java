public class BubbleSortObject {

    public int[] generateArray() {
        int[] theArray = new int[10];
        return theArray;
    }

    public int[] generateArray(int i) {
        int[] theArray = new int[i];
        return theArray;
    }

    public int getArraySize(int[] arr) {
        return arr.length;
    }

    public void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100)+10;
        }
    }

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("---------------------");
    }

    public void bubbleSortMethod(int[] arr) {
        int swapCalled = 0;
        System.out.println("The swap method has been called...");
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapCalled++;
                }
            }
        }
        System.out.println("Finished sorting the array,");
        System.out.println("Number of iterations through the swap method:"); // ********** " + swapCalled + " **********.");
        System.out.println("********** " + swapCalled + " ********** ");
    }

    public void swap(int[] arr, int a, int b) {
        if (a == b) return;
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        BubbleSortObject mySort = new BubbleSortObject();
        System.out.println();
        System.out.println();
        System.out.println("Now an array with size 25");
        int[] myArray = mySort.generateArray(25);
        mySort.fillArray(myArray);
        mySort.getArraySize(myArray);
        mySort.printArray(myArray);
        mySort.bubbleSortMethod(myArray);
        mySort.printArray(myArray);
        System.out.println();


        System.out.println();
        System.out.println("Now an array with size 1000");
        BubbleSortObject bigSortObj = new BubbleSortObject();
        int[] myNewArray = bigSortObj.generateArray(1000);
        bigSortObj.fillArray(myNewArray);
        bigSortObj.getArraySize(myNewArray);
        bigSortObj.bubbleSortMethod(myNewArray);
        System.out.println();


        System.out.println();
        System.out.println("Now an array with size 10000");
        BubbleSortObject secondBigSortObj = new BubbleSortObject();
        int[] secondNewArray = secondBigSortObj.generateArray(10000);
        secondBigSortObj.fillArray(secondNewArray);
        secondBigSortObj.getArraySize(secondNewArray);
        secondBigSortObj.bubbleSortMethod(secondNewArray);
        System.out.println();

        System.out.println();
        System.out.println("Now an array with size 1,000,000");
        BubbleSortObject thirdBigSortObj = new BubbleSortObject();
        int[] thirdNewArray = thirdBigSortObj.generateArray(10000);
        thirdBigSortObj.fillArray(thirdNewArray);
        thirdBigSortObj.getArraySize(thirdNewArray);
        thirdBigSortObj.bubbleSortMethod(thirdNewArray);
        System.out.println();





        System.out.println();
        System.out.println("Now an array with size 100,000,000");
        BubbleSortObject hundredMillionObj = new BubbleSortObject();
        int[] hundredMillionArray = hundredMillionObj.generateArray(100000000);

    }

}
