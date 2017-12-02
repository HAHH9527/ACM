package hduOJ.date20171202;

import java.util.ArrayList;
import java.util.Scanner;

public class Num1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) continue;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > m) {
                    list.add(i, m);
                    break;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) System.out.print(" " + list.get(i));
                else System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
