package lesson3;

import java.util.Scanner;

public class FindMInValueOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the SIZE of array:");
        int inputLength = scanner.nextInt();
        int[] arr = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            System.out.println("Enter value of element with index is" + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("FIND MIN VALUE OF ARRAY");
        int minElement = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (minElement > arr[i]) {
                minElement = arr[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
