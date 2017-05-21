package skillTest_V2.skillTest34;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] c = str.toCharArray();
	if (c.length == 11 && c[0] == '1' && (c[1] == 3 || c[1] == 5 || c[1] == 8)
		&& (c[6] == c[7] && c[7] == c[8] && c[8] == c[9] && c[9] == c[10])) {
	    System.out.println("true");
	} else {
	    System.out.println("false");
	}
    }
}
