import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String str;
        int na = 0;
        str = a.next();

        for (int i = 0; i < str.length(); i++)
            if (i != i + 1 && str.charAt(i) == 'A' || str.charAt(i) == 'a') {
                if (str.charAt(i + 1) == 'c' || str.charAt(i + 1) == 'C') {
                    i++;
                    na++;
                }
            }
        System.out.println(na);
    }
}
