package lesson3;

import java.util.Scanner;

public class ComputeSumOfDiagonal {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("SUM OF DIAGONAL");
        System.out.println("Enter length of square matrix:");
        int[][] arr = createASquareMatrix(3);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int sumLeftToRight = 0, sumRightToLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeftToRight += arr[i][i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1 - i) {
                    sumRightToLeft += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Left to Right Diagonal: " + sumLeftToRight);
        System.out.println("Sum of Right to Left Diagonal: " + sumRightToLeft);


    }

    public static int[][] createASquareMatrix(int inputLength) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[inputLength][inputLength];
        for (int i = 0; i < inputLength; i++) {
            for (int j = 0; j < inputLength; j++) {
                System.out.println("Enter element at index row=" + i + " col=" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
}
