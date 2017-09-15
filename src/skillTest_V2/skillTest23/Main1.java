package skillTest_V2.skillTest23;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag3 = false, flag5 = false, flag7 = false;
        if (x % 3 == 0) {
            flag3 = true;
        }
        if (x % 5 == 0) {
            flag5 = true;
        }
        if (x % 7 == 0) {
            flag7 = true;
        }
        if (flag3 && flag5 && flag7) {
            System.out.println("��ͬʱ��3��5��7����");
        } else if (flag3 && flag5) {
            System.out.println("��ͬʱ��3��5����");
        } else if (flag3 && flag7) {
            System.out.println("��ͬʱ��3��7����");
        } else if (flag5 && flag7) {
            System.out.println("��ͬʱ��5��7����");
        } else if (flag3 || flag5 || flag7) {
            System.out.println("ֻ�ܱ�3��5��7�е�һ������");
        } else {
            System.out.println("���ܱ�3��5��7��һ������");
        }
    }
}
