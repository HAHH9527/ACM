/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161217;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int r = sc.nextInt();
                int e = sc.nextInt();
                int c = sc.nextInt();
                int temp = e - (r + c);
                if (temp > 0) {
                    System.out.println("advertise");
                } else if (temp == 0) {
                    System.out.println("does not matter");
                } else if (temp < 0) {
                    System.out.println("do not advertise");
                }
            }
        }
    }
}
