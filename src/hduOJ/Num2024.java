/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num2024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String temp = sc.nextLine();
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                String str = sc.nextLine();
                char[] arr = str.toCharArray();
                if ((arr[0] >= 'A' && arr[0] <= 'Z') || (arr[0] >= 'a' && arr[0] <= 'z') || arr[0] == '_') {
                    for (int j = 1; j < arr.length; j++) {
                        if ((arr[j] >= 'A' && arr[j] <= 'Z') || (arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= '0' && arr[j] <= '9') || arr[j] == '_') {

                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else {
                    flag = false;
                }
                if (flag) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
