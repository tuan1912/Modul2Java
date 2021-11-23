package Example;

public class NhiPhan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int dau = 0;
        int cuoi = arr.length - 1;
        System.out.println(deQuy(dau,cuoi,-1,arr));
//        int giua = (dau + cuoi) / 2;


//        while (cuoi >= dau) {
//            if (arr[giua] == -1) {
//                System.out.println(giua);
//                break;
//            } else if (arr[giua] < -1) {
//                dau = giua + 1;
//            } else {
//                cuoi = giua - 1;
//            }
//
//            giua = (dau + cuoi) / 2;
//        }
    }

    public static int deQuy(int dau, int cuoi, int value, int[] arr) {
        if (dau > cuoi){
            return -1;
        }
        int giua = (dau + cuoi) / 2;
        if (arr[giua] == value) {
            return giua;
        } else if (arr[giua] < value) {
            return deQuy(giua + 1, cuoi, value, arr);
        } else {
            return deQuy(dau, giua - 1, value, arr);
        }
    }
}