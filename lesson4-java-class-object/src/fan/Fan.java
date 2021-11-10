package fan;

public class Fan {
    //   \*** UML ***\
    //  \*SlOW = 1 : const *\
    //  \* MEDIUM=2 : const *\
    //  \* FAST = 3 : const *\
    //  speed : int
    //  on : boolean = false
    //  radius : double = 5
    //  color : String = "blue"
    //  Fan()
    //  getter,setter
    //  toString()
    final int  SLOW =1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private  int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public  String toString() {
        if (this.on) return speed+ color+radius+ "fan is on";
        else return color + radius + "fan is off";
    }
}
