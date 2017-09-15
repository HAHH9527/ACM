package skillTest_V2.skillTest33;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        int count = 0;
        boolean Spaces = true;
        for (char temp : c) {
            if (temp != ' ' && Spaces) {
                count++;
                Spaces = false;
            } else if (temp == ' ') {
                Spaces = true;
            }
        }
        System.out.println(count);
    }
}
