package hduOJ.date20171209;

import java.util.Scanner;

public class Num1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                double u = sc.nextDouble();
                double v = sc.nextDouble();
                double w = sc.nextDouble();
                double l = sc.nextDouble();
                System.out.printf("%.3f", l / (u + v) * w);
                System.out.println("");
            }
        }
    }
}
