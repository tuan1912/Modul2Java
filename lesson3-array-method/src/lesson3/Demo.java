package lesson3;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        arr = show(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"  ");
        }

    }
    public  static int[] show(int[] arr) {
        int[] arrnew = new int[2];
        arr = arrnew;
        return arrnew;
    }

}
