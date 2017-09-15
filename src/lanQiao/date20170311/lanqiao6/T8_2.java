package lanQiao.date20170311.lanqiao6;

import java.util.Scanner;

public class T8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int w2 = w * 2;
        int m = sc.nextInt();
        int n = sc.nextInt();

        // ��λ��
        int mw = 0;
        int nw = 0;
        if (m % w2 == 0) {
            mw = 1;
        } else if (m % w2 < w) {
            mw = m % w;
        } else if (m % w == 0) {
            mw = w;
        } else {
            mw = w - (m % w) + 1;
        }
        if (n % w2 == 0) {
            nw = 1;
        } else if (n % w2 < w) {
            nw = n % w;
        } else if (n % w == 0) {
            nw = w;
        } else {
            nw = w - (n % w) + 1;
        }
        int wight = Math.abs(mw - nw);

        // ��λ��
        int mh = 0;
        int nh = 0;
        if (m % w == 0) {
            mh = m / w;
        } else {
            mh = m / w + 1;
        }
        if (n % w == 0) {
            nh = n / w;
        } else {
            nh = n / w + 1;
        }
        int hight = Math.abs(mh - nh);

        // ���
        System.out.println(wight + hight);
    }
}
