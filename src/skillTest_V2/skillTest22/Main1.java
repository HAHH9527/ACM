package skillTest_V2.skillTest22;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������·ݣ�");
        int month = sc.nextInt();
        System.out.print("������Ʊ����");
        int ticket = sc.nextInt();
        if (month >= 7 && month <= 9) {
            if (ticket > 20) {
                System.out.println("�Ż�15%");
            } else {
                System.out.println("�Ż�5%");
            }
        } else if (month >= 1 && month <= 5) {
            if (ticket > 20) {
                System.out.println("�Ż�30%");
            } else {
                System.out.println("�Ż�20%");
            }
        } else if (month >= 1 && month <= 12) {
            System.out.println("�Ż�10%");
        } else {
            System.out.println("��������ȷ���·ݣ�");
        }
    }
}
