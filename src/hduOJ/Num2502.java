package hduOJ;

import java.util.Scanner;

public class Num2502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int out = (int) (Math.pow(2, n - 1) + Math.pow(2, n - 1) * (n - 1) / 2);
                System.out.println(out);
            }
        }
    }
}
