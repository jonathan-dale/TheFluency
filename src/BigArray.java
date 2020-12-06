public class BigArray {

    int bigArraySize = 0;
    int[] arr = new int[bigArraySize];

    public BigArray() {
        this.bigArraySize = 20; //default size
        this.arr = new int[bigArraySize];
        generateRandomArray(arr);
    }

    public BigArray(int n) {
        this.bigArraySize = n;
        this.arr = new int[bigArraySize];
        generateRandomArray(arr);
    }

    public void generateRandomArray(int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printLength(int[] arr) {
        System.out.println("This array has a size of " + arr.length);
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("First BigArray object");
        BigArray firstBigArrayObject = new BigArray();
        firstBigArrayObject.printLength(firstBigArrayObject.arr);
        firstBigArrayObject.print(firstBigArrayObject.arr);

        System.out.println();
        System.out.println("Second BigArray object");
        BigArray secondBigArray = new BigArray(50);
        secondBigArray.printLength(secondBigArray.arr);
        secondBigArray.print(secondBigArray.arr);

        System.out.println();
        System.out.println("Third BigArray object");
        BigArray thirdBigArray = new BigArray(25);
        thirdBigArray.printLength(thirdBigArray.arr);
        thirdBigArray.print(thirdBigArray.arr);

    }




}
