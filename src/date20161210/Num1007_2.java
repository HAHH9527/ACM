/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161210;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1007_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] x = new int[n];
                for (int j = 0; j < x.length; j++) {
                    x[j] = sc.nextInt();
                }
                int[] out = new int[n * (n - 1) / 2];
                int count = 0;
                for (int j = 0; j < x.length; j++) {
                    for (int l = j + 1; l < x.length; l++) {
                        out[count] = x[j] - x[l];
                        if (out[count] < 0) {
                            out[count] = -out[count];
                        }
                        count++;
                    }
                }
                Arrays.sort(out);
                int outnum = -1;
                int temp = -1;
                for (int j = 0; j < out.length; j++) {
                    if (out[j] != outnum) {
                        outnum = out[j];
                        k--;
                        if (k == 0) {
                            System.out.println(outnum);
                            break;
                        }
                    }
                }
            }
        }
    }
}
