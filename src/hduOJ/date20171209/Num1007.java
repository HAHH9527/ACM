package hduOJ.date20171209;

import java.util.Scanner;

public class Num1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int sum = 3;
                for (int j = 0; j < a; j++) {
                    sum = (sum - 1) * 2;
                }
                System.out.println(sum);
            }
        }
    }
}
