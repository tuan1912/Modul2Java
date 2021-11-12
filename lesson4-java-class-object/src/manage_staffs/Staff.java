package manage_staffs;

// \**   Ta có đối tượng nhân viên gồm tên , tuổi , giới tính
//có Menu sau: 1. Hiển thị nhân viên
//             2.Thêm nhân viên
//             3. Xóa nhân viên
//    Ta có mảng nhân viên có sẵn 3 đối tượng:
//            nhấn 1. hiển thị các nhân viên trong mảng
//                 2. Thêm đối tượng
//                 3. Xóa 1 nhân viên theo tên   **\
//public class Staff {
//    static int id = 1;
//    private String name;
//    private int age;
//    private String gender;
//    private int idIndex;
//
//    public Staff(String name, int age, String gender) {
//        this.idIndex = id++;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public int getIdIndex() {
//        return idIndex;
//    }
//
//    public static int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Staff{" + "id = " + idIndex +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                '}';
//    }
//}
