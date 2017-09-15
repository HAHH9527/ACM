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
public class Num2076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                double h = sc.nextInt();
                if (h > 12) {
                    h = h - 12;
                }
                double m = sc.nextInt();
                double s = sc.nextInt();
                double angle1 = 30.0 * h + 30.0 / 60.0 * m + 30.0 / 3600.0 * s;
                double angle2 = 6.0 * m + 6.0 / 60.0 * s;
                double angle = angle1 - angle2;
                if (angle < 0) {
                    angle = -angle;
                }
                if (angle > 180) {
                    angle = 360 - angle;
                }
                System.out.println((int) (angle));
            }
        }
    }
}
