package intern_management_system.service;

import intern_management_system.model.Intern;

import java.util.ArrayList;

public class ManagementServiceImpl implements IManagement {
    static ArrayList<Intern> listOfIntern = new ArrayList<>(0);

    static {
        Intern internNumberOne = new Intern("A", 22, 9.0d);
        Intern internNumberTwo = new Intern("B", 21, 8.4d);
        Intern internNumberThree = new Intern("C", 25, 9.2d);
        listOfIntern.add(internNumberOne);
        listOfIntern.add(internNumberTwo);
        listOfIntern.add(internNumberThree);
    }

    @Override
    public ArrayList<Intern> findAll() {
        return listOfIntern;
    }

    @Override
    public void save(Intern intern) {
        listOfIntern.add(intern);

    }

    @Override
    public int getIndexByInternId(int internId) {
        for (int i = 0; i < listOfIntern.size(); i++) {
            if (listOfIntern.get(i).getInternId() == internId) return i;
        }
        return -1;
    }


    @Override
    public void removeInternByInternId(int internId) {
        listOfIntern.remove(getIndexByInternId(internId));
    }

    @Override
    public void changeInfoByInternId(int internId, String name, int age, double gradeAverage) {
        int index = getIndexByInternId(internId);
        listOfIntern.get(index).setAge(age);
        listOfIntern.get(index).setName(name);
        listOfIntern.get(index).setGradeAverage(gradeAverage);
    }

    @Override
    public void sortWithAverage() {
        Intern temp;
        for (int i = 0; i < listOfIntern.size()-1; i++)
            if (listOfIntern.get(i).getGradeAverage() > listOfIntern.get(i + 1).getGradeAverage()) {
                temp = listOfIntern.get(i);
                listOfIntern.set(i, listOfIntern.get(i + 1));
                listOfIntern.set(i + 1, temp);
            }
    }

    @Override
    public double getSumOfGrades() {
        double sumOfGrades = 0;
        for (Intern x :
                listOfIntern) {
            sumOfGrades += x.getGradeAverage();
        }
        return sumOfGrades;
    }
}
