package exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Circle cir2 = new Circle(3.2,"green");
        System.out.println(cir2.getArea());
    }
}
