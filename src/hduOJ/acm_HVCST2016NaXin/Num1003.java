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
public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            char[] arr = temp.toCharArray();
            if (arr[0] > arr[2]) {
                char t = arr[0];
                arr[0] = arr[2];
                arr[2] = t;
            }
            if (arr[0] > arr[1]) {
                char t = arr[0];
                arr[0] = arr[1];
                arr[1] = t;
            }
            if (arr[1] > arr[2]) {
                char t = arr[1];
                arr[1] = arr[2];
                arr[2] = t;
            }
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        }
    }
}
