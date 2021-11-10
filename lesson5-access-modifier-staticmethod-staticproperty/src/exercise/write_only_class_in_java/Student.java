package exercise.write_only_class_in_java;

public class Student {
    //         \*****UML*****\
//    attributes: name : String
//                classes: String
//    method:     Student()
//                setName(String name) : String
//                setClasses(String classes): String
    private String name = "Tuấn";
    private String classes = "C0921K1";
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
}
