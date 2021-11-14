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
        System.out.println("Enter business days:");
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
    public static int findStaffByName(String name,Staff[] array){
        int countName = 0;
        boolean checked = true;
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                System.out.println(array[i].toString());
                countName ++;
                checked = false;
            }
        }
        if (checked) System.out.println("No match!");
        return countName;
    }
    public static Staff[] deleteStaffByName(String name,int countName, Staff[] array) {

        Staff[] arrTemp = new Staff[array.length - countName];
        int count = 0;
        for (int i = 0; i < array.length-countName; i++) {
            if (array[i+count].getName().equals(name)) {
                count ++;
            }
            arrTemp[i] = array[i+count];
        }
        return arrTemp;
    }
    public static int findIndexByStaffId (int staffId, Staff[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getStaffId() == staffId)
                return i;
        }
        return  -1;
    }
    public static Staff[] deleteStaffByStaffId(int index, Staff[] array){
        Staff[] arrTemp = new Staff[array.length - 1];
        for (int i = 0; i < arrTemp.length; i++) {
            if (i < index) arrTemp[i] = array[i];
            else  arrTemp[i] = array[i + 1];
        }
        return arrTemp ;
    }
    public static void editInformationEmployee(int index, Staff[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter daily wages:");
        int dailyWages = scanner.nextInt();
        System.out.println("Enter business days:");
        double businessDays = scanner.nextDouble();
        array[index].setName(name);
        array[index].setAge(age);
        array[index].setDailyWages(dailyWages);
        array[index].setBusinessDays(businessDays);

    }public static void editInformationEngineer(int index, Staff[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter daily wages:");
        int dailyWages = scanner.nextInt();
        System.out.println("Enter business days:");
        double businessDays = scanner.nextDouble();
        System.out.println("Enter pay rate:");
        double payRate = scanner.nextDouble();
        array[index].setName(name);
        array[index].setAge(age);
        array[index].setDailyWages(dailyWages);
        array[index].setBusinessDays(businessDays);
        ((Engineer)array[index]).setPayRate(payRate);

    }




}
