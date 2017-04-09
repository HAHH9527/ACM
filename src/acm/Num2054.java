/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author 9527number
 */
public class Num2054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigDecimal num1 = sc.nextBigDecimal();
            BigDecimal num2 = sc.nextBigDecimal();
            String str1 = num1.stripTrailingZeros().toPlainString();
            String str2 = num2.stripTrailingZeros().toPlainString();
            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
