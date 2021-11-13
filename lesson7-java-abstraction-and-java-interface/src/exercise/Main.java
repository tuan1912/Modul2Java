package exercise;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(5);
        arr[1] = new Rectangle(1,2);
        arr[2] = new Square(3);
        for (Shape x : arr) {
            System.out.println(x.toString());
        }
        for (int i = 0; i < arr.length; i++) {
            double randomPercent = Math.random()*100;
            arr[i].resize(randomPercent);
            System.out.println(arr[i].toString()+ " with  "+ randomPercent + " percent");
        }
    }

}
