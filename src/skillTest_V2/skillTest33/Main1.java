package skillTest_V2.skillTest33;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        for (char temp : c) {
            switch (temp) {
                case '0':
                    System.out.print("��");
                    break;

                case '1':
                    System.out.print("һ");
                    break;

                case '2':
                    System.out.print("��");
                    break;

                case '3':
                    System.out.print("��");
                    break;

                case '4':
                    System.out.print("��");
                    break;

                case '5':
                    System.out.print("��");
                    break;

                case '6':
                    System.out.print("��");
                    break;

                case '7':
                    System.out.print("��");
                    break;

                case '8':
                    System.out.print("��");
                    break;

                case '9':
                    System.out.print("��");
                    break;
            }
        }
        System.out.println();
    }
}
