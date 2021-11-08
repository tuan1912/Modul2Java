package lesson3;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class MergeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MERGE ARRAY");
        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value of element Arr1:"+" index is "+i);
            arr1[i] = scanner.nextInt();
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter value of element Arr2: "+"index is" + i);
            arr2[i] = scanner.nextInt();
            arr3[i+arr1.length]= arr2[i];
        }
        System.out.println("merge array:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"  ");
        }
    }
}
