package lanQiao.date20170502.lanqiaojuesai.t7;

public class T3 {
    static void f(int n) {
        String[][] di = {
                { //
                        " 00000 ", //
                        "0     0", //
                        "0     0", //
                        "0     0", //
                        "0     0", //
                        "0     0", //
                        " 00000 "}, //
                { //
                        "     1 ", //
                        "   1 1 ", //
                        "     1 ", //
                        "     1 ", //
                        "     1 ", //
                        "     1 ", //
                        "   1111"}, //
                { //
                        " 22222 ", //
                        "2     2", //
                        "      2", //
                        "     2 ", //
                        "   2   ", //
                        " 2    2", //
                        "2222222"}, //
                { //
                        " 33333 ", //
                        "3     3", //
                        "      3", //
                        "  3333 ", //
                        "      3", //
                        "3     3", //
                        " 33333 "}, //
                { //
                        "   44  ", //
                        "  4 4  ", //
                        " 4  4  ", //
                        "4   4  ", //
                        "4   4  ", //
                        "4444444", //
                        "    4  "}, //
                { //
                        " 55555 ", //
                        " 5     ", //
                        "555555 ", //
                        "      5", //
                        "      5", //
                        "5     5", //
                        " 55555 "}, //
                { //
                        " 6666  ", //
                        "6      ", //
                        "666666 ", //
                        "6     6", //
                        "6     6", //
                        "6     6", //
                        " 66666 "}, //
                { //
                        "7777777", //
                        "7    7 ", //
                        "    7  ", //
                        "   7   ", //
                        "  7    ", //
                        " 7     ", //
                        " 7     "}, //
                { //
                        " 88888 ", //
                        "8     8", //
                        "8     8", //
                        " 88888 ", //
                        "8     8", //
                        "8     8", //
                        " 88888 "}, //
                { //
                        " 99999 ", //
                        "9     9", //
                        "9     9", //
                        " 999999", //
                        "      9", //
                        "9     9", //
                        " 99999 "}};//

        char[] cc = ("" + n).toCharArray();

        for (int i = 0; i < di[0].length; i++) {
            for (int j = 0; j < cc.length; j++) {
                System.out.print(di[cc[j] - 48][i] + " "); // ���λ��
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        f(2016);
    }
}
