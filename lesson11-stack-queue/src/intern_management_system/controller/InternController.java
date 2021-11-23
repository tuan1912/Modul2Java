package intern_management_system.controller;

import intern_management_system.model.Intern;
import intern_management_system.service.ManagementServiceImpl;

import java.util.ArrayList;

public class InternController {
    ManagementServiceImpl manageIntern = new ManagementServiceImpl();

    public ArrayList<Intern> findAll() {
        return manageIntern.findAll();
    }

    public void createIntern(Intern intern) {
        manageIntern.save(intern);
    }

    public int getIndexByInternId(int internId) {
        return manageIntern.getIndexByInternId(internId);
    }

    public void removeInternByInternId(int internId) {
        manageIntern.removeInternByInternId(internId);
    }

    public void changeInfoByInternId(int internId, String name, int age, double gradeAverage) {
        manageIntern.changeInfoByInternId(internId, name, age, gradeAverage);
    }

    public void sortWithAverage() {
        manageIntern.sortWithAverage();
    }

    public double getSumOfGrades() {
        return manageIntern.getSumOfGrades();
    }


}
