/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this strlate file, choose Tools | Templates
 * and open the strlate in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 * 怎么能判断是否结束
 *
 * @author 9527number
 */
public class Num1088 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = new String("");
        String str;
        while (sc.hasNext()) {
            str = sc.next();
            if ("".equals(str)) {
                continue;
            }
            if ("<br>".equals(str)) {
                System.out.println(result);
                result = "";
            } else if ("<hr>".equals(str)) {
                if (result.compareTo("") != 0) {
                    System.out.println(result);
                }
                for (int i = 0; i < 80; i++) {
                    System.out.print("-");
                }
                System.out.println();
                result = "";
            } else {
                String temp = result;
                if ((temp + " " + str).length() < 80) {
                    if (!"".equals(result)) {
                        result += " " + str;
                    } else {
                        result = str;
                    }
                } else {
                    System.out.println(result);
                    result = str;
                }
            }
        }
        if (!("".equals(result))) {
            System.out.println(result);
        }
    }
}
