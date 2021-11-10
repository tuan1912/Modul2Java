package quadratic_equation;

public class QuadrationEquation {
    // ax^2 + bx + c = 0
    //class QuadraticEquation
    //attributes: double a, b, c
    //method: getCoefficientA(), set
//                getCoefficientA()
//                getConstantC()
    //           getQuadrationFomula()
    //            getRoot1()
    //            getRoot2()
    private double coefficientA;
    private double coefficientB;
    private double constantC;

    public QuadrationEquation() {

    }

    public QuadrationEquation(double coefficientA, double coefficientB, double constantC) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.constantC = constantC;
    }

    public double getCoefficientA() {
        return coefficientA;
    }

    public void setCoefficientA(double coefficientA) {
        this.coefficientA = coefficientA;
    }

    public double getCoefficientB() {
        return coefficientB;
    }

    public void setCoefficientB(double coefficientB) {
        this.coefficientB = coefficientB;
    }

    public double getConstantC() {
        return constantC;
    }

    public void setConstantC(double constantC) {
        this.constantC = constantC;
    }

    public double getQuadraticFomula() {
        return Math.pow(coefficientB, 2) - 4 * coefficientA * constantC;
    }

    public double getRoot1() {
        if (getQuadraticFomula() < 0) {
            System.out.println("No real root!");
            return 99999999;
        } else if (getQuadraticFomula() == 0) {
            return -coefficientB / (2 * coefficientA);
        } else {
            return (-coefficientB + Math.pow(getQuadraticFomula(), 0.5)) / (2 * coefficientA);
        }
    }

    public double getRoot2() {
        if (getQuadraticFomula() < 0) {
            System.out.println("No real root!");
            return 99999999;
        } else if (getQuadraticFomula() == 0) {
            return -coefficientB / (2 * coefficientA);
        } else {
            return (-coefficientB - Math.pow(getQuadraticFomula(), 0.5)) / (2 * coefficientA);
        }
    }

}
