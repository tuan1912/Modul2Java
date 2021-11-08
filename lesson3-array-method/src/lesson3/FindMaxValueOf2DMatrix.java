package lesson3;

import java.util.Scanner;

public class FindMaxValueOf2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a 2D Matrix ");
        System.out.println("Enter number of rows:");
        int inputRows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int inputCols = scanner.nextInt();
        float[][] matrix = new float[inputRows][inputCols];
        for (int i = 0; i < inputRows; i++) {
            for (int j = 0; j < inputCols; j++) {
                System.out.println("Enter value of element " + "row is" + i + " column is  " + j);
                matrix[i][j] = scanner.nextFloat();
            }
        }

        int indexI=0 ,indexJ=0 ;
        float maxElement = matrix[0][0];
        for (int i = 0; i < inputRows; i++) {
            for (int j = 0; j < inputCols; j++) {
                if (maxElement < matrix[i][j]) {
                    maxElement = matrix[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Max of elements is: " +maxElement + ", index is: " + indexI+", " + indexJ);

    }
}
