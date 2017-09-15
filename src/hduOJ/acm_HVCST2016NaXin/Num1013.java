/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.acm_HVCST2016NaXin;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1013 {

    public static int day(int n, int y, int r) {
        int allday = r;
        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < y; i++) {
            allday += day[i];
        }
        if (((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) && y > 2) {
            allday += 1;
        }
        return allday;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            String[] arr = str.split("/");
            int n = Integer.valueOf(arr[0]);
            int y = Integer.valueOf(arr[1]);
            int r = Integer.valueOf(arr[2]);
            System.out.println(day(n, y, r));
        }
    }
}
