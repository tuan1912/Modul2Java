package manage_staffs_homeworks;

public class Engineer extends Staff {
    private double payRate;
    public Engineer(){

    }
    public Engineer(String name, int age, int dailyWages, double businessDays, double payRate){

        setName(name);
        setAge(age);
        setDailyWages(dailyWages);
        setBusinessDays(businessDays);
        setPayRate(payRate);
    }
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public double getSalary() {
        return getPayRate()*getBusinessDays()*getDailyWages();
    }

    @Override
    public String toString() {
        return super.toString() + "Engineer {"+
                "payRate=" + payRate +
                '}';
    }
}
