package manage_staffs_homeworks;

public class TestIntanceOf {
    public static void main(String[] args) {
        Employee employeeNumberOne = new Employee("A",12,1000,20);
        Employee employeeNumberTwo = new Employee("C",11,100,18);
        Engineer engineerNumberOne = new Engineer("B",12,1000,20,2.5);
        Staff[] arrayOfStaff = new Staff[3];
        arrayOfStaff[0] = employeeNumberOne;
        arrayOfStaff[1] = employeeNumberTwo;
        arrayOfStaff[2] = engineerNumberOne;
        System.out.println(employeeNumberOne.getSalary());
    }
}
