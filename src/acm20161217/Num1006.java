/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161217;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            long w = sc.nextLong();
            long d = sc.nextLong();
            long inWeighs = sc.nextLong();
            long num = 0;
            for (int i = 0; i < n; i++) {
                num += i;
            }
            long allWeighs = num * w;
            long lessWeighs = allWeighs - inWeighs;
            long count = lessWeighs / d;
            if (count == 0) {
                count = n;
            }
            System.out.println(count);
        }
    }
}
