package manage_staffs_OKer;
public class Staff {
    static int id = 1;
    private String name;
    private int age;
    private String gender;
    private int staffId;

    public Staff(String name, int age, String gender) {
        this.staffId = id++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getStaffId() {
        return staffId;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" + "id = " + staffId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}