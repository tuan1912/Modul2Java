package lesson3;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = deleteElementOfArray(1,arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"  ");
        }
    }

    // Xóa phần tử ở vị trí bất kì
    public static int[] deleteElementOfArray(int index, int[] arr) {
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                temp[i] = arr[i];
            } else if ((i >= index) && (i <= arr.length - 2)) {
                temp[i] = arr[i + 1];
            }
        }
        return temp;
    }
}
