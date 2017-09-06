/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.acm_HVCST2016NaXin;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int T = sc.nextInt();
            for (int i = 1; i <= T; i++) {
                int N = sc.nextInt();
                if (N >= 300) {
                    N = N % 50;
                } else if (N >= 300) {
                    N -= 300;
                } else if (N >= 200) {
                    N -= 200;
                } else if (N >= 150) {
                    N -= 150;
                }
                System.out.println(N);
            }
        }
    }
}
