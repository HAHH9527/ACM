package hduOJ.date20171202;

import java.util.Scanner;

public class Num1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int temp = sc.nextInt();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == temp) {
                    flag++;
                }
            }
            System.out.println(flag);
        }
    }
}
