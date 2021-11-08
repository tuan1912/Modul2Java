package lesson3;

import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        int inputValue = scanner.nextInt();
        deleteElement(inputValue, array);

    }

    public static int[] deleteElement(int value, int[] arr) {
        boolean check = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
