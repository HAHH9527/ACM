package hduOJ.date20171202;

import java.util.Scanner;
import java.math.BigInteger;

public class Num1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            BigInteger out = BigInteger.ONE;
            if (n != 0) {
                for (int i = 1; i <= n; i++) {
                    BigInteger temp = BigInteger.valueOf(i);
                    out = out.multiply(temp);
                }
            }
            System.out.println(out);
        }
    }
}