package hduOJ.date20171125;

import java.util.Arrays;
import java.util.Scanner;

public class Num1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        }
    }
}
