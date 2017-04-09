/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161112;

/**
 *
 * @author 9527number
 */
import java.util.Scanner;

public class Num1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) {
                continue;
            }
            int[] in = new int[n];
            for (int i = 0; i < n; i++) {
                in[i] = sc.nextInt();
            }
            int[] out = new int[n + 1];
            int t = 0;
            int i = 0;
            for (; t < out.length; t++, i++) {
                if (x > in[i]) {
                    out[t] = in[i];
                } else {
                    out[t] = x;
                    t++;
                    break;
                }
            }
            for (; t < out.length; t++, i++) {
                out[t] = in[i];
            }
            for (int j = 0; j < out.length - 1; j++) {
                System.out.print(out[j] + " ");
            }
            System.out.println(out[out.length - 1]);
        }
    }
}
