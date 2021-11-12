package exercise;

public class Circle {
    // *** UML  ***
    // radius : double
    // color : String
    //getter,setter
    //  getArea()
    // getPerimeter()
    //  toString()
    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return  Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
