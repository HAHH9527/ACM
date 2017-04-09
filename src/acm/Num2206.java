/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num2206 {

    public static boolean ip1(String ip) {
        boolean ret = true;
        String[] temp = ip.split("\\.");
        if (temp.length != 4) {
            ret = false;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() > 3) {
                ret = false;
            }
            int n = -1;
            try {
                n = Integer.valueOf(temp[i]);
            } catch (Exception e) {
                ret = false;
            }
            if (n >= 0 && n <= 255) {
            } else {
                ret = false;
            }
        }
        return ret;
    }

    public static boolean ip2(String ip) {
        boolean ret = true;
        char[] temp = ip.toCharArray();
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == '.') {
                count++;
            }
            if (temp[i] == '.' || (temp[i] >= '0' && temp[i] <= '9')) {
            } else {
                ret = false;
            }
        }
        if (count != 3) {
            ret = false;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.nextLine();
            if (ip1(ip) && ip2(ip)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
