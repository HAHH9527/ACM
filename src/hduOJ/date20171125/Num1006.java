package hduOJ.date20171125;

import java.util.Scanner;

public class Num1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String str1 = sc.next();
                String str2 = sc.next();
                char[] chars = str1.toCharArray();
                for (int i1 = 0; i1 < chars.length / 2; i1++) {
                    System.out.print(chars[i1]);
                }
                System.out.print(str2);
                for (int i1 = chars.length / 2; i1 < chars.length; i1++) {
                    System.out.print(chars[i1]);
                }
                System.out.println();
            }
        }
    }
}
