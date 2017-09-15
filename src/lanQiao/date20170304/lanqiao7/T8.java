package lanQiao.date20170304.lanqiao7;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long max = n;
        for (long i = 1; i <= n; i++) {
            long temp = i;
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = temp * 3 + 1;
                }
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
