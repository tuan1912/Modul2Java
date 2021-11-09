package lesson3;

import java.util.Arrays;
import java.util.Scanner;

//Bai nay hay
//
//
public class DeleteAValueOfArray {
    public static void main(String[] args) {
        String str = "a b c X Y Z";
        String[] arr = str.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter value you wanna delete:");
        String value = scanner.next();
        System.out.println(Arrays.toString(deleteElementByValue(value,arr)));

    }
    public static String[] deleteElementByValue(String value,String[] str){
        //Xoa 1 phan tu
        int countValue=0;
        for (int i = 0; i < str.length; i++) {
            if (value.equals(str[i])) {
                countValue ++;
            }
        }

        String[] arr = new String[str.length-countValue];
        int count = 0;
        for (int i = 0; i < str.length-count; i++) {
            if (value.equals(str[i])){
                count ++;

            }
            arr[i] = str[i +count];
        }
        return arr;
    }
//
//    import java.util.Arrays;
//import java.util.Scanner;
//
////    public class KiemTraChuoi {
//        public static void main(String[] args) {
//            String str = "abczy zabc";
//            String[] arr = str.split("");
//            System.out.println(Arrays.toString(arr));
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhập phần tử cần tìm");
//            String str2 = sc.nextLine();
//
//            int count = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].equals(str2)) {
//                    count++;
//                    System.out.println(str2 + " ở vị trí thứ " + i);
//                }
//            }
//
//            System.out.println(count);
//            System.out.println(Arrays.toString(removeArr(arr,str2,count)));
//
//        }
//
//        public static String[] removeArr(String[] arr, String value, int sl) {
//            String[] arrNew = new String[arr.length - sl];
//            int count = 0;
//            for (int i = 0; i < arr.length - count; i++) {
//                if (arr[i+count].equals(value)) {
//                    count++;
//                }
//                arrNew[i] = arr[i + count];
//
//            }
//            return arrNew;
//        }
//
//    }
}
