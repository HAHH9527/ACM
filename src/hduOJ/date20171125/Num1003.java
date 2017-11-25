package hduOJ.date20171125;

import java.util.Scanner;

public class Num1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (sc.hasNext()) {
            String c = sc.next();
            if (c.equals("@")) {
                break;
            }
            if (flag) {
                System.out.println();
            } else {
                flag = true;
            }
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    for (int i1 = 1; i1 <= n - i; i1++) {
                        System.out.print(" ");
                    }
                    System.out.println(c);
                } else if (i == n) {
                    for (int i1 = 1; i1 <= (n * 2) - 1; i1++) {
                        System.out.print(c);
                    }
                    System.out.println();
                } else {
                    for (int i1 = 1; i1 <= n - i; i1++) {
                        System.out.print(" ");
                    }
                    System.out.print(c);
                    for (int i1 = 1; i1 <= ((i - 1) * 2) - 1; i1++) {
                        System.out.print(" ");
                    }
                    System.out.println(c);
                }
            }
        }
    }
}
