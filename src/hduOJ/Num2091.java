package hduOJ;

import java.util.Scanner;

public class Num2091 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            for (int t = 1; ; t++) {
                String A = sc.next();
                if ("@".equals(A)) {
                    break;
                } else if (t != 1) {
                    System.out.println("");
                }
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    if (i == 1) {
                        for (int j = 1; j <= n - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(A);
                    } else if (i == n) {
                        for (int j = 1; j <= (n * 2) - 1; j++) {
                            System.out.print(A);
                        }
                        System.out.println("");
                    } else {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print(A);
                        for (int j = 1; j <= ((i - 1) * 2) - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(A);
                    }
                }
            }
            break;
        }
    }
}