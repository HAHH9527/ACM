package hduOJ;

import java.util.Scanner;

public class Num1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            while (0 != n--) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
