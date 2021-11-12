package manage_staffs_OKer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Staff[] arr = new Staff[3];
        Scanner scanner = new Scanner(System.in);
        arr[0] = new Staff("Tuấn", 28, "Nam");
        arr[1] = new Staff("Toàn", 22, "Nam");
        arr[2] = new Staff("Thắng", 28, "Nữ");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. NEW");
            System.out.println("2. ADD");
            System.out.println("3. DELETE");
            System.out.println("4. EDIT");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Controller.showStaff(arr);
                    break;
                case 2:
                    arr = Controller.addStaff(arr);
                    break;
                case 3:
                    System.out.println("Enter id you wanna delete:");
                    int id = scanner.nextInt();
                    int index = Controller.findIndexByStaffId(id, arr);
                    arr = Controller.deleteStaff(index, arr);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter a name  :");
                    String name = scanner.nextLine();
                    for (int i = 0; i < arr.length; i++) {
                        if (name.equals(arr[i].getName())) System.out.println(arr[i].toString());
                    }
                    System.out.println("Which one do you want to update:");
                    int inputId = scanner.nextInt();
                    int indexUpdate = Controller.findIndexByStaffId(inputId, arr);
                    System.out.println(indexUpdate);
                    arr = Controller.editInfo(indexUpdate, arr);

            }
        }
    }
}
