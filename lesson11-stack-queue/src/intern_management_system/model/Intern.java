package intern_management_system.model;

public class Intern extends Person implements Comparable {
    private int internId;
    private double gradeAverage;
    public Intern(){

    }
    public Intern(String name, int age, double gradeAverage){
        internId= id++;
        setName(name);
        setAge(age);
        this.gradeAverage = gradeAverage;
    }

    public int getInternId() {
        return internId;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    @Override
    public String toString() {
        return "Intern{" + "intern id = "+ internId +
                super.toString()+
                ", gradeAverage= " + gradeAverage +
                '}';
    }



    @Override
    public int compareTo(Object intern) {
        if (gradeAverage == ((Intern)intern).getGradeAverage()) return 0;
        else if (gradeAverage > ((Intern)intern).getGradeAverage()) return 1;
        else return -1;
    }
}
