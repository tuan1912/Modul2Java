package quadratic_equation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solving Quadration Equations");
    QuadrationEquations qe = new QuadrationEquations(1,1,-2);
        System.out.println(qe.getRoot1());
        System.out.println(qe.getRoot2());
    }
}
