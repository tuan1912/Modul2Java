package manage_staffs_homeworks;

public abstract class Staff {
    private static int id = 1;
    private int staffId ;
    private String name;
    private int age;
    private int dailyWages;
    private double businessDays;

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDailyWages() {
        return dailyWages;
    }

    public  void setStaffId() {
        staffId = id++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDailyWages(int dailyWages) {
        this.dailyWages = dailyWages;
    }

    public void setBusinessDays(double businessDays) {
        this.businessDays = businessDays;
    }

    public double getBusinessDays() {
        return businessDays;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dailyWages=" + dailyWages +
                ", businessDays=" + businessDays +
                '}';
    }
}
