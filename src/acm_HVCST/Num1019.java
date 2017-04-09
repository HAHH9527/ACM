/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_HVCST;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            String temp = sc.nextLine();
            String ball = sc.nextLine();
            char[] ballc = ball.toCharArray();
            int red = 0;
            int yellow = 0;
            for (int i = 0; i < N; i++) {
                char t = ballc[i];
                switch (t) {
                    case 'R':
                        red++;
                        break;
                    case 'Y':
                        yellow++;
                        break;
                    case 'B':
                        if (red == 7) {
                            System.out.println("Red");
                        } else {
                            System.out.println("Yellow");
                        }
                        break;
                    case 'L':
                        if (yellow == 7) {
                            System.out.println("Yellow");
                        } else {
                            System.out.println("Red");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
