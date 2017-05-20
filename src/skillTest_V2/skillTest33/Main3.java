package skillTest_V2.skillTest33;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] c = str.toCharArray();
	for (char temp : c) {
	    if (temp >= 'a' && temp <= 'z') {
		System.out.print((char) (temp - 32));
	    } else if (temp >= 'A' && temp <= 'Z') {
		System.out.print((char) (temp + 32));
	    }
	}
    }
}
