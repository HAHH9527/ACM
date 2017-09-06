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
public class Num1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int i = 0;
            String[] color = new String[1000];
            int[] num = new int[1000];
            for (int j = 0; j < n; j++) {
                String temp = sc.next();
                boolean flag = true;
                for (int k = 0; k < i; k++) {
                    if (temp.equals(color[k])) {
                        num[k]++;
                        break;
                    }
                }
                if (flag) {
                    color[i] = temp;
                    num[i]++;
                    i++;
                }
            }
            int arr = 0;
            int max = 0;
            for (int j = 0; j < num.length; j++) {
                if (arr < num[j]) {
                    arr = num[j];
                    max = j;
                }
            }
            System.out.println(color[max]);
        }
    }
}
