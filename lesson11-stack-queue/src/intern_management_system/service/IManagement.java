package intern_management_system.service;

import intern_management_system.model.Intern;

import java.util.ArrayList;

public interface IManagement {
    ArrayList<Intern> findAll();

    void save(Intern intern);

    int getIndexByInternId(int internId);

    void removeInternByInternId(int internId);

    void changeInfoByInternId(int internId,String name, int age, double gradeAverage);

    void sortWithAverage();

    double getSumOfGrades();
}
