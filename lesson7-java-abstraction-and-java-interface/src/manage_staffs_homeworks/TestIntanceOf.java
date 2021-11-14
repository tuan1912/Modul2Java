package manage_staffs_homeworks;

public class TestIntanceOf {
    public static void main(String[] args) {
        Staff employeeNumberOne = new Employee();
        Employee employeeNumberTwo = new Employee();
        Engineer engineerNumberOne = new Engineer();
        Staff[] arrayOfStaff = new Staff[3];
        arrayOfStaff[0] = employeeNumberOne;
        arrayOfStaff[1] = employeeNumberTwo;
        arrayOfStaff[2] = engineerNumberOne;
        Employee em1 = (Employee) employeeNumberOne;
        if (employeeNumberTwo instanceof Staff) System.out.println("hohoho");
        else System.out.println("huhuhu");
        Controller.showAllOfStaff(arrayOfStaff);
        System.out.println(engineerNumberOne.getStaffId());
    }
}
