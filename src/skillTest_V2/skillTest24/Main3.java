package skillTest_V2.skillTest24;

import java.util.Scanner;

public class Main3 {
    private static boolean huiWen(String str) {
        char[] c = str.toCharArray();
        for (int i = 0, i2 = c.length - 1; i < c.length; i++, i2--) {
            if (i2 <= i) {
                break;
            }
            if (c[i] != c[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(huiWen(str));
    }
}
