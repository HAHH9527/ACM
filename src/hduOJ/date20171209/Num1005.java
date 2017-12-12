package hduOJ.date20171209;

import java.util.Scanner;

public class Num1005 {
    //公式法，推倒过程多问刘博文，另外一个枚举方法问会长
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int out = (int) (Math.pow(2, n - 1) + Math.pow(2, n - 1) * (n - 1) / 2);
                System.out.println(out);
            }
        }
    }
}
