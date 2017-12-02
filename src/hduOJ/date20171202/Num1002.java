package hduOJ.date20171202;

import java.util.Scanner;

public class Num1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            boolean flag = true;
            while (n-- != 0) {
                if (flag) {
                    flag = false;
                } else {
                    System.out.println();
                }
                int[] num = new int[5];
                String str = sc.nextLine();
                char[] arr = str.toCharArray();
                for (char c : arr) {
                    switch (c) {
                        case 'a':
                            num[0]++;
                            break;
                        case 'e':
                            num[1]++;
                            break;
                        case 'i':
                            num[2]++;
                            break;
                        case 'o':
                            num[3]++;
                            break;
                        case 'u':
                            num[4]++;
                            break;
                    }
                }
                System.out.println("a:" + num[0]);
                System.out.println("e:" + num[1]);
                System.out.println("i:" + num[2]);
                System.out.println("o:" + num[3]);
                System.out.println("u:" + num[4]);
            }
        }
    }
}
