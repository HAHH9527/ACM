package lanQiao.date20170311.lanqiao6;

public class T3_ {
    public static double f(double i) {
        if (i == 30) {
            return 0.9;
        }
        return i / (i + f(i + 1));
    }

    public static void main(String[] args) {
        System.out.printf("%.5f", f(1));
    }
}
