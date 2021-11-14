package manage_staffs_homeworks;


import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    public static void showAllOfStaff(Staff[] array){
        for (Staff x : array) System.out.println(x.toString());
    }
    public static Staff[] createNewEngineer(Staff[] array){
        Scanner scanner = new Scanner(System.in);
        Staff[] arrTemp = new Staff[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrTemp[i] = array[i];
        }
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter daily wages:");
        int dailyWages = scanner.nextInt();
        System.out.println("Enter business day:");
        double businessDays = scanner.nextDouble();
        System.out.println("Enter pay rate:");
        double payRate = scanner.nextDouble();
        Engineer newEngineer = new Engineer(name, age, dailyWages, businessDays, payRate);
        arrTemp[arrTemp.length - 1] = newEngineer;
        return arrTemp;
    }
    public static Staff[] createNewEmployee(Staff[] array){
        Scanner scanner = new Scanner(System.in);
        Staff[] arrTemp = new Staff[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrTemp[i] = array[i];
        }
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter daily wages:");
        int dailyWages = scanner.nextInt();
        System.out.println("Enter business day:");
        double businessDays = scanner.nextDouble();
        Employee newEmployee = new Employee(name, age, dailyWages, businessDays);
        arrTemp[arrTemp.length - 1] = newEmployee;
        return arrTemp;
    }





}
