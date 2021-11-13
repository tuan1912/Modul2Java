package exercise;

public class Circle extends Shape implements Resizeable {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double getPerimetter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String show() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        radius += radius*percent/100;
    }
}