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
public class Num1004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String temp = sc.nextLine();
            for (int s = 1; s <= n; s++) {
                String str = sc.nextLine();
                char[] ch = str.toCharArray();
                int a = 0;
                int e = 0;
                int i = 0;
                int o = 0;
                int u = 0;
                for (int j = 0; j < ch.length; j++) {
                    switch (ch[j]) {
                        case 'a':
                            a++;
                            break;
                        case 'e':
                            e++;
                            break;
                        case 'i':
                            i++;
                            break;
                        case 'o':
                            o++;
                            break;
                        case 'u':
                            u++;
                            break;
                        default:
                            break;
                    }
                }
                System.out.println("a:" + a);
                System.out.println("e:" + e);
                System.out.println("i:" + i);
                System.out.println("o:" + o);
                System.out.println("u:" + u);
                if (s < n) {
                    System.out.println("");
                }
            }
        }
    }
}
