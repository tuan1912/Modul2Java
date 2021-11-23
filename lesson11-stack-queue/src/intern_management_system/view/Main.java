package intern_management_system.view;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    InternView internView = new InternView();
    public Main() {
        System.out.println("MENU MANAGE STUDENT");
        System.out.println("1.Show all of intern\n" +
                "2.Get index of list by intern id\n"+
                "3.Delete intern by intern id: "+
                "\n" +
                "4.Creat new intern:\n"+
                "5.Edit Student:\n" +
                "6.Sort by grade average:\n"+
                "7.Get sum of grade average\n");
        int choiceMenu = scanner.nextInt();
        switch (choiceMenu){
            case 1:
                internView.showListOfIntern();
                break;
            case 2:
                internView.findIndexOfInternById();
                break;
            case 3:
                internView.removeInternByInternId();
                break;
            case 4:
                internView.createNewIntern();
                break;
            case 5:
                internView.changeInformationOfIntern();
                break;
            case 6:
                internView.sortWithAverage();
                break;
            case 7:
                internView.getSumOfGrades();
                break;



        }
    }
    public static void main(String[] args) {
        new Main();
        // write your code here
    }

}
