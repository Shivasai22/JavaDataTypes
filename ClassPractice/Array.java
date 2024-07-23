public class Array {
    public static void main(String[] args) {
        int num[] = { 5, 6, 7, 8 };
        System.out.println(num[0]);

        int num2[] = new int[5];
        num2[0] = 5;
        num2[1] = 6;
        num2[2] = 7;
        num2[3] = 8;
        num2[4] = 9;

        for (int i = 0; i <= 4; i++) {
            System.out.println(num2[i]);
        }

        int[] myArray = new int[5];

        // Assign values to the array
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        // Access and print the values of the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}
