package hduOJ;

import java.util.Scanner;

public class Num2031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            boolean flag = false;
            if (N < 0) {
                flag = true;
                N = -N;
            }
            int[] a = new int[999];
            int i = 0;
            while (N != 0) {
                a[i] = N % R;
                N = N / R;
                i++;
            }
            if (flag) {
                System.out.print("-");
            }
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] >= 10) {
                    char t = (char) ('A' + (a[j] - 10));
                    System.out.print(t);
                } else {
                    System.out.print(a[j]);
                }
            }
            System.out.println("");
        }
    }
}
