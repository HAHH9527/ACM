package skillTest_V2.skillTest26;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] c = str.toCharArray();
	int count = 0;
	for (char d : c) {
	    if (d >= '0' && d <= '9') {
		count++;
	    }
	}
	System.out.println(count);
    }
}
