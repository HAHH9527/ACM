package skillTest_V2.skillTest28;

public class Main1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 3) {
            int j = 100 - i;
            if (j * 3 + i / 3 == 100) {
                System.out.println("����:" + j);
                System.out.println("С����:" + i);
            }
        }
    }
}
