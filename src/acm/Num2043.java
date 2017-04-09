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
public class Num2043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                String password = sc.next();
                char[] arr = password.toCharArray();
                boolean[] flagC = new boolean[4];
                boolean flag = true;
                if (arr.length < 8 || arr.length > 16) {
                    System.out.println("NO");
                    continue;
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 'A' && arr[i] <= 'Z') {
                        flagC[0] = true;
                    } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                        flagC[1] = true;
                    } else if (arr[i] >= '0' && arr[i] <= '9') {
                        flagC[2] = true;
                    } else if (other(arr[i])) {
                        flagC[3] = true;
                    } else {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    continue;
                }
                int count = 0;
                for (int i = 0; i < flagC.length; i++) {
                    if (flagC[i]) {
                        count++;
                    }
                }
                if (count >= 3) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static boolean other(char c) {
        char[] other = {'~', '!', '@', '#', '$', '%', '^'};
        for (int i = 0; i < other.length; i++) {
            if (c == other[i]) {
                return true;
            }
        }
        return false;
    }
}
