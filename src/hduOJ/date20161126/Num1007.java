/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161126;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1007 {

    static boolean hwsYN = false;
    static int[] out = new int[200];
    static int flag = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            hwsYN = false;
            out = new int[200];
            flag = 0;

            int n = sc.nextInt();
            out[0] = n;
            while (hwsYN == false) {
                n = hws(n);
            }
            System.out.println(flag);
            int t = 0;
            while (true) {
                System.out.print(out[t]);
                t++;
                if (out[t] == 0) {
                    break;
                } else {
                    System.out.print("--->");
                }
            }
            System.out.println("");
        }
    }

    public static int hws(int n) {
        int ret = n;
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        if (str.equals(str2)) {
            hwsYN = true;
        } else {
            flag++;
            ret = n + Integer.valueOf(str2);
            out[flag] = ret;
        }
        return ret;
    }
}
