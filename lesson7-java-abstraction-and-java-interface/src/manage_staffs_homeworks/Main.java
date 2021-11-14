package manage_staffs_homeworks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employeeNumberOne = new Employee();
        Employee employeeNumberTwo = new Employee();
        Engineer engineerNumberOne = new Engineer();
        Staff[] arrayOfStaff = new Staff[3];
        arrayOfStaff[0] = employeeNumberOne;
        arrayOfStaff[1] = employeeNumberTwo;
        arrayOfStaff[2] = engineerNumberOne;
        int choice = -1;
        while (choice != 0) {
            // MENU
            System.out.println("1. NEW STAFF");
            System.out.println("2. FIND STAFF");
            System.out.println("3. DELETE STAFF");
            System.out.println("4. EDIT");
            System.out.println("5. PRINT SALARY TABLE");
            System.out.println("6. SORT");
            System.out.println("7. EXIT");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Create engineer or employee ?");
                    System.out.println("1. Engineer");
                    System.out.println("2. Employee");
                    int choiceKindOfStaff = scanner.nextInt();
                    switch (choiceKindOfStaff) {
                        case 1: arrayOfStaff = Controller.createNewEngineer(arrayOfStaff);
                        case 2: arrayOfStaff = Controller.createNewEmployee(arrayOfStaff);
                    }
                    break;
                case 2:
                    System.out.println("Enter a name:");
                    String name = scanner.nextLine();

            }
        }

    }
}
