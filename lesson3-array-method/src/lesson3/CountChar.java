package lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "nguyen";
        System.out.println("Enter character you wanna count:");
        char inputChar = scanner.next().charAt(0);
        int count = countChar(inputChar,str);
        System.out.println("Result: "+count);
    }
    public static int countChar(char inputChar,String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inputChar){
                count ++;
            }
        }
        return count;
    }
}
