package hduOJ.date20171125;

import java.util.Scanner;

public class Num1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int M = sc.nextInt();
                int flag = M * 3;
                for (int i1 = 0; i1 < flag; i1++) {
                    for (int i2 = 0; i2 < M; i2++) {
                        System.out.print("HDU");
                    }
                    System.out.println();
                }
            }
        }
    }
}
