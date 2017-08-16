/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161112;

/**
 *
 * @author 9527number
 */
import java.util.Scanner;

public class Num1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                continue;
            }
            int[] all = new int[n];
            for (int i = 0; i < all.length; i++) {
                all[i] = sc.nextInt();
            }
            int min = all[0];
            int x = 0;
            for (int i = 0; i < all.length; i++) {
                if (all[i] < min) {
                    min = all[i];
                    x = i;
                }
            }
            int temp = all[x];
            all[x] = all[0];
            all[0] = temp;
            for (int i = 0; i < all.length - 1; i++) {
                System.out.print(all[i] + " ");
            }
            System.out.println(all[all.length - 1]);
        }
    }
}
