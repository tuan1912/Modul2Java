package intern_management_system.view;

import intern_management_system.controller.InternController;
import intern_management_system.model.Intern;

import java.util.Scanner;

public class InternView {
    InternController internController = new InternController();
    Scanner scanner = new Scanner(System.in);

    public void chooseFromMenu() {
        System.out.println("Enter'quit' or anyone else ");
        String enterOrQuit = scanner.next();
        if (!enterOrQuit.equalsIgnoreCase("quit")) {
            new Main();
        } else {
            System.exit(0);
        }
    }

    public void showListOfIntern() {
        for (int i = 0; i < internController.findAll().size(); i++) {
            System.out.println(internController.findAll().get(i).toString());
        }
        chooseFromMenu();
    }
    public void findIndexOfInternById(){
        System.out.println("Enter intern id you wanna delete:");
        int internId = Integer.parseInt(scanner.nextLine());
        System.out.println(internController.getIndexByInternId(internId));
    }
    public void createNewIntern() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter grade average:");
        double gradeAverage = Double.parseDouble(scanner.next());
        Intern intern = new Intern(name, age, gradeAverage);
        internController.createIntern(intern);
        chooseFromMenu();
    }

    public boolean isIntern(int internId) {
        if (internController.getIndexByInternId(internId) == -1) {
            System.out.println("Oops! Intern id doesn't exist!");
            return false;
        }
        return true;
    }

    public void removeInternByInternId() {
        System.out.println("Enter intern id you wanna delete:");
        int internId = Integer.parseInt(scanner.nextLine());
        if (isIntern(internId)) {
            internController.removeInternByInternId(internId);
        }
        chooseFromMenu();
    }

    public void changeInformationOfIntern() {
        System.out.println("Enter intern id you wanna change:");
        int internId = Integer.parseInt(scanner.nextLine());
        if (isIntern(internId)) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            System.out.println("Enter grade average:");
            double gradeAverage = Double.parseDouble(scanner.next());
            internController.changeInfoByInternId(internId, name, age, gradeAverage);
        }
        chooseFromMenu();
    }
    public void sortWithAverage(){
        internController.sortWithAverage();
        chooseFromMenu();
    }
    public void getSumOfGrades(){
        System.out.println(internController.getSumOfGrades());
        chooseFromMenu();
    }
}
