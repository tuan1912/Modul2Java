package exercise;

public class Rectangle extends Shape implements Resizeable {
    private double weight;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public double getPerimetter() {
        return (weight + height) * 2;
    }

    @Override
    public String show() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        weight += weight * percent / 100;
        height += height * percent / 100;
    }
}