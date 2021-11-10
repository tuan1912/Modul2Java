package manage_staffs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Staff[] arr = new Staff[3];
        arr[0] = new Staff("Tuấn", 28, "Nam");
        arr[1] = new Staff("Toàn", 22, "Nam");
        arr[2] = new Staff("Thắng", 28, "Nữ");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Hiển thị nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Xóa nhân viên");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i].toString());
                    }

                    break;
                case 2:
                    Staff[] arrAdd = new Staff[arr.length + 1];
                    for (int i = 0; i < arrAdd.length; i++) {
                        if (i < arrAdd.length - 1) arrAdd[i] = arr[i];
                        else {
                            scanner.nextLine();// Mẹo để nó nhận phím enter trước vì nextLine nó nhạn cả enter, có thể thay bằng next()
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
                    break;
                case 3:
                    Staff[] arrSub = new Staff[arr.length - 1];
                    System.out.println("Enter id you wanna delete:");
                    int id = scanner.nextInt();
                    if(id> Staff.id||id <1) System.out.println("Doesn't exist!");
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].getIdIndex() == id) {
                           index = i;
                        }
                    }
                    if (index>-1){
                        for (int i = 0; i < arrSub.length; i++) {
                            if (i<index) arrSub[i] = arr[i];
                            else{
                                arrSub[i] = arr[i + 1];
                            }
                        }
                        arr = arrSub;
                    }



                    break;

            }
        }
    }
}


