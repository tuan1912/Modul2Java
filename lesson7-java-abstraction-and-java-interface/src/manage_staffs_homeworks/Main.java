package manage_staffs_homeworks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employeeNumberOne = new Employee("A",12,1000,20);
        Employee employeeNumberTwo = new Employee("C",11,100,18);
        Engineer engineerNumberOne = new Engineer("B",12,1000,20,2.5);
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
                    int choiceKindOfStaff = -1;
                    while (choiceKindOfStaff != 1 && choiceKindOfStaff != 2){
                        choiceKindOfStaff = scanner.nextInt();
                        switch (choiceKindOfStaff) {
                            case 1:
                                arrayOfStaff = Controller.createNewEngineer(arrayOfStaff);
                                break;
                            case 2:
                                arrayOfStaff = Controller.createNewEmployee(arrayOfStaff);
                                break;
                        }
                    }

                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter a name:");
                    String name = scanner.nextLine();
                    Controller.findStaffByName(name, arrayOfStaff);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter a name:");
                    String inputNameCase3 = scanner.nextLine();
                    int countName = Controller.findStaffByName(inputNameCase3, arrayOfStaff);
                    if (countName <=  0)   break;

                    System.out.println("which one do you want to delete");
                    System.out.println("1. All those name");
                    System.out.println("2. Delete by Staff Id");
                    int choiceDeleteByNameOrByStaffId = 0;
                    while (choiceDeleteByNameOrByStaffId != 1 && choiceDeleteByNameOrByStaffId != 2) {
                        choiceDeleteByNameOrByStaffId = scanner.nextInt();
                        switch (choiceDeleteByNameOrByStaffId) {
                            case 1:
                                arrayOfStaff = Controller.deleteStaffByName(inputNameCase3, countName, arrayOfStaff);
                                break;
                            case 2:
                                System.out.println("Enter staff id you wanna delete:");
                                int inputStaffIdCase3 = scanner.nextInt();// Interger.parseInt(scanner.nextLine())
                                int indexOfStaffIdCase3 = Controller.findIndexByStaffId(inputStaffIdCase3, arrayOfStaff);
                                if (indexOfStaffIdCase3 > -1) arrayOfStaff = Controller.deleteStaffByStaffId(indexOfStaffIdCase3,arrayOfStaff);
                                else System.out.println("Oops! ");
                                break;
                        }
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter a name:");
                    String inputNameCase4 = scanner.nextLine();
                    Controller.findStaffByName(inputNameCase4, arrayOfStaff);
                    System.out.println("Enter staff id you wanna edit information:");
                    int inputStaffIdCase4 =  scanner.nextInt();
                    int indexOfStaffIdCase4 = Controller.findIndexByStaffId(inputStaffIdCase4,arrayOfStaff);
                    if (indexOfStaffIdCase4> -1) {
                        if (arrayOfStaff[indexOfStaffIdCase4] instanceof Employee) {
                            Controller.editInformationEmployee(indexOfStaffIdCase4,arrayOfStaff);
                        } else {
                            Controller.editInformationEngineer(indexOfStaffIdCase4,arrayOfStaff);
                        }
                    } else System.out.println("Oops!");
                    break;
                case 5:
                    System.out.println("Which one do you wanna show?");
                    System.out.println("1. Employee");
                    System.out.println("2. Engineer");
                    int choiceShow = 0;
                    while (choiceShow != 1 && choiceShow != 2){
                        choiceShow = scanner.nextInt();
                        switch (choiceShow){
                            case 1:
                                Controller.showEmployeeSalaryTable(arrayOfStaff);
                                break;
                            case 2:
                                Controller.showEngineerSalaryTable(arrayOfStaff);
                                break;
                        }
                    }
                    break;
                case 6:
                    Controller.sortSalaryTableByName(arrayOfStaff);
                    Controller.showAllOfStaff(arrayOfStaff);
                    break;
                case 7:
                    choice = 0;
            }
        }

    }
}
