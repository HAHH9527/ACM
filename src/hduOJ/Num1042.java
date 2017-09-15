/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * @author 9527number
 */
public class Num1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            BigInteger out = BigInteger.ONE;
            if (n != 0) {
                out = BigInteger.ONE;
                for (int i = 1; i <= n; i++) {
                    BigInteger temp = BigInteger.valueOf(i);
                    out = out.multiply(temp);
                }
            }
            System.out.println(out);
        }
    }
}
