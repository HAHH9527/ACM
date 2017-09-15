/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161119;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            long root = n;
            for (int i = 1; i < n; i++) {
                root = root * n;
            }
            String rootstr = String.valueOf(root);
            while (rootstr.length() != 1) {
                int[] temp = new int[rootstr.length()];
                for (int i = 0; i < rootstr.length(); i++) {
                    temp[i] = Integer.valueOf(rootstr.substring(i, i + 1));
                }
                root = 0;
                for (int i = 0; i < temp.length; i++) {
                    root += temp[i];
                }
                rootstr = String.valueOf(root);
            }
            System.out.println(root);
        }
    }
}
