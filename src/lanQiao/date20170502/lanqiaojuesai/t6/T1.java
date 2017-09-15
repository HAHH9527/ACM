package lanQiao.date20170502.lanqiaojuesai.t6;

import java.util.ArrayList;

public class T1 {
    private static ArrayList<String> toA = new ArrayList<String>();
    private static ArrayList<String> toB = new ArrayList<String>();

    public static void main(String[] args) {
        a();
        b();
        for (int i = 0; i < toA.size(); i++) {
            for (int i2 = 0; i2 < toB.size(); i2++) {
                if (toA.get(i).equals(toB.get(i2))) {
                    System.out.println(toA.get(i));
                }
            }
        }
    }

    private static void a() {
        int a = 8;
        int b = 6;
        int c = 4;
        for (int i = 100; i >= 0; i--) {
            for (int i2 = 100 - i; i2 >= 0; i2--) {
                int i3 = 100 - i2 - i;
                int count = i * c + i2 * b + i3 * a;
                if (count == 600) {
                    String str = "a:" + i3 + "\tb:" + i2 + "\tc:" + i;
                    toA.add(str);
                    // System.out.println("a:" + i3 + "\tb:" + i2 + "\tc:" + i);
                }
            }
        }
    }

    private static void b() {
        int a = 1;
        int b = 3;
        int c = 4;
        for (int i = 100; i >= 0; i--) {
            for (int i2 = 100 - i; i2 >= 0; i2--) {
                int i3 = 100 - i2 - i;
                int count = i * c + i2 * b + i3 * a;
                if (count == 280) {
                    String str = "a:" + i3 + "\tb:" + i2 + "\tc:" + i;
                    toB.add(str);
                    // System.out.println("a:" + i3 + "\tb:" + i2 + "\tc:" + i);
                }
            }
        }
    }
}
