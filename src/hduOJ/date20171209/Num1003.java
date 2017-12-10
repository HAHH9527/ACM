package hduOJ.date20171209;

import java.util.Scanner;

public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double d = sc.nextDouble();
                System.out.printf("%.1f", Math.sqrt((a - c) * (a - c) + (b - d) * (b - d)));
                System.out.println("");
            }
        }
    }
}
