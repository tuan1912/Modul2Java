package lesson3;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = 0, choice = -1;
        System.out.println("Insert Element of  Array");

        while (inputLength < 1 || inputLength > 10) {
            System.out.println("ENTER length of array:");
            inputLength = scanner.nextInt();
        }
        int[] arr = new int[inputLength];
        while (choice != 0) {

            System.out.println("1. Insert Element");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                    cách 1 hơi đần
                    int inputIndex = -1;
                    while (inputIndex < 0 || inputIndex > inputLength - 1) {
                        System.out.println("Enter index of Element");
                        inputIndex = scanner.nextInt();
                    }
                    System.out.println("Enter value of Element:");
                    int inputValue = scanner.nextInt();
                    int[] temp = new int[inputLength];// có thể dùng lệnh copy mảng System.arraycopy(arrFrom,index -bắt- đầu- muốn -copy,arrTo,index-arrTo-bắt đầu->,index-arrTo-kết thúc);
                    for (int i = 0; i < inputLength; i++) { //int[] temp = arr; là temp[i] nó khác arr[i]
                        temp[i] = arr[i];
                    }
                    arr[inputIndex] = inputValue;
                    for (int i = inputIndex + 1; i < inputLength; i++) {
                        arr[i] = temp[i - 1];
                    }

                    break;
                case 0:
                    System.out.println("You just got an array:");
                    for (int i = 0; i < inputLength; i++) {
                        System.out.print(arr[i] + "  ");
                    }
            }


        }


    }

}
