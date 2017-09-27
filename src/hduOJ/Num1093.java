package hduOJ;

import java.util.Scanner;

public class Num1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (0 != n--) {
                int m = sc.nextInt();
                int sum = 0;
                while (0 != m--) {
                    sum += sc.nextInt();
                }
                System.out.println(sum);
            }
        }
    }
}
