package manage_staffs_OKer;

import java.util.Scanner;

public class Controller {

    public static void showStaff(Staff[] arr) {
        for (Staff x : arr) {
            System.out.println(x.toString());
        }
    }

    public static Staff[] addStaff(Staff[] arr) {
        Staff[] arrAdd = new Staff[arr.length + 1];
        for (int i = 0; i < arrAdd.length; i++) {
            if (i < arrAdd.length - 1) arrAdd[i] = arr[i];
            else {
                Scanner scanner = new Scanner(System.in);
                // Mẹo để nó nhận phím enter trước vì nextLine nó nhạn cả enter, có thể thay bằng next(), đã thử next() nhưng không được
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                System.out.println("Enter gender:");
                String gender = scanner.next();
                arrAdd[i] = new Staff(name, age, gender);
            }
        }
        arr = arrAdd;
        return arrAdd;
    }
    public static int findIndexByStaffId(int id,Staff[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getStaffId() == id) {
                return i;
            }
        }
        System.out.println("Doesn't exist!");
        return -1;
    }

    public static Staff[] deleteStaff(int index,Staff[] arr) {
        Staff[] arrSub = new Staff[arr.length - 1];
        if (index > -1) {
            for (int i = 0; i < arrSub.length; i++) {
                if (i < index) arrSub[i] = arr[i];
                else {
                    arrSub[i] = arr[i + 1];
                }
            }
            arr = arrSub;
        }
        return  arr;
    }
    public static Staff[] editInfo(int inputIndex, Staff[] arr){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {  // không cần for
            if (i == inputIndex) {
                System.out.println("Enter new name:");
                String newName = scanner.next();
                System.out.println("Enter new age:");
                int newAge = scanner.nextInt();
                System.out.println("Enter new gender:");
                String newGender = scanner.next();
                arr[i].setName(newName);
                arr[i].setAge(newAge);
                arr[i].setGender(newGender);
                return arr;
            }
        }
        System.out.println("Oops!");
        return arr;
    }
}
