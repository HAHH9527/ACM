package hduOJ.date20171209;

import java.util.Scanner;

public class Num1008 {
    private static void show(String c, int l) {
        int x1 = (l + 1) / 2;//上面的圆输出到第几行
        int x2 = (l / 6) + 1;//竖线粗细
        int x3 = (l - 2) / 2;//保证下面的空格为矩形需要多宽
        for (int i = 1; i <= l; i++) {
            String outLine = "";
            if (i == 1 || i == x1 || i == l) {//上下和中间输出横线
                for (int j = 0; j < x2; j++) {//将x2个空格存入outLine
                    outLine += " ";
                }
                for (int j = 0; j < x3; j++) {//将x3个字符存入outLine
                    outLine += c;
                }
            } else {
                for (int j = 0; j < x2; j++) {//将x2个字符存入outLine
                    outLine += c;
                }
                for (int j = 0; j < x3; j++) {//将x3个空格存入outLine
                    outLine += " ";
                }
                for (int j = 0; j < x2; j++) {//将x2个字符存入outLine
                    outLine += c;
                }
            }
            System.out.println(outLine);//对于每次处理完成outLine输出并换行
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean f = true;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n-- > 0) {
                if (f) {
                    f = false;
                } else {
                    System.out.println();
                }
                String c = sc.next();
                int l = sc.nextInt();
                show(c, l);//对于每次给的字符和高度，打印对应的8
            }
        }
    }
}
