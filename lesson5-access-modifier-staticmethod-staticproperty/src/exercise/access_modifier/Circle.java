package exercise.access_modifier;

public class Circle {
    //      \***UML***\
    //        Circle
    //   radius: double = 1.0
    //   color : String = "red"
    //  Circle()
    //  Circle(r: double)
    //  getRadius() : double
    //  getArea(): double
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}
