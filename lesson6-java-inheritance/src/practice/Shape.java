package practice;

public class Shape {
    //      \**UML**\
    //        Shape
    //  color: String  = green
    // filled : boolean = true
    //  Shape()
    // Shape(String color, boolean filled)
    //  getter setter
    //  toString()

    // \** UML **\
    //
    private String color;
    private boolean filled;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
