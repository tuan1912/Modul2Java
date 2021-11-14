package manage_staffs_homeworks;

public class Employee extends Staff{

    public Employee(){

    }
    public Employee(String name, int age,int dailyWages, double businessDays){
        setStaffId();
        setName(name);
        setAge(age);
        setDailyWages(dailyWages);
        setBusinessDays(businessDays);
    }
    @Override
    public double getSalary() {
        return getDailyWages()*getBusinessDays();
    }

    @Override
    public String toString() {
        return super.toString()+"Employee";
    }
}
