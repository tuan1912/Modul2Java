package lesson3;

import java.util.Scanner;

public class SumOfColumn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SUM OF COLUMN");
        int[][] arr = creatAn2DArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Enter index of column you wanna get sum");
        int intputIndexOfCol = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == intputIndexOfCol)
                    sum += arr[i][j];
            }
        }
        System.out.println("Sum of column "+intputIndexOfCol+" is: "+sum);


    }

    public static int[][] creatAn2DArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a 2D Matrix ");
        System.out.println("Enter number of rows:");
        int inputRows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int inputCols = scanner.nextInt();
        int[][] matrix = new int[inputRows][inputCols];
        for (int i = 0; i < inputRows; i++) {
            for (int j = 0; j < inputCols; j++) {
                System.out.println("Enter value of element " + "row is" + i + " column is  " + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
