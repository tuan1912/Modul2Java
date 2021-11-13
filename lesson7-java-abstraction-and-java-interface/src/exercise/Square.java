package exercise;

public class Square extends Shape implements Resizeable{
    private double side;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimetter() {
        return 4*side;
    }

    @Override
    public String show() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        side += side*percent/100;
    }
}