/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num2033 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int AH = sc.nextInt();
                int AM = sc.nextInt();
                int AS = sc.nextInt();
                int BH = sc.nextInt();
                int BM = sc.nextInt();
                int BS = sc.nextInt();
                int H = AH + BH;
                int M = AM + BM;
                int S = AS + BS;
                if (S >= 60) {
                    S -= 60;
                    M++;
                }
                if (M >= 60) {
                    M -= 60;
                    H++;
                }
                System.out.println(H + " " + M + " " + S);
            }
        }
    }
}
