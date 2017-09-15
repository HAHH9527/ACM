package skillTest_V2.skillTest31;

public class Main1 {
    public static void main(String[] args) {
        int all = 48;
        int lunZi = 172;
        for (int x = 0; x <= all; x++) {
            int y = all - x;
            if (x * 3 + y * 4 == lunZi) {
                System.out.println("Ħ��������" + x + "\t����������" + y);
            }
        }
    }
}
