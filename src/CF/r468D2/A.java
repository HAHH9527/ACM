package CF.r468D2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;
            if (a < b) {
                int c = a;
                a = b;
                b = c;
            }
            int count = 1;
            while (true) {
                a--;
                ans += count;
                if (a == b) {
                    break;
                }
                b++;
                ans += count;
                if (a == b) {
                    break;
                }
                count++;
            }
            System.out.println(ans);
        }
    }
}
