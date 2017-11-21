import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextDouble();
            int m = sc.nextInt();
            double answer = 0;
            for (int i = 0; i < m; i++) {
                answer += n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f", answer);
            System.out.println("");
        }
    }
}