package skillTest_V2.skillTest31;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������M��");
        int m = sc.nextInt();
        System.out.println("������N��");
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                count += i * i;
            } else {
                count += i * i * i;
            }
        }
        System.out.println(count);
    }
}
