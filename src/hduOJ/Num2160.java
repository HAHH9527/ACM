package hduOJ;

import java.util.Scanner;

public class Num2160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[21];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i < 21; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                System.out.println(a[n]);
            }
        }
    }
}
