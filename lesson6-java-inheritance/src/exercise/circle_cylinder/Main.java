package exercise.circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle cir = new Cylinder();
        cir.setColor("red");
        cir.setRadius(5);
        ((Cylinder)cir).setHeight(5);
        System.out.println(cir.getArea());
        System.out.println(((Cylinder)cir).getVolume());
    }
}
