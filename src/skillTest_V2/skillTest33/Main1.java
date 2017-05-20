package skillTest_V2.skillTest33;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] c = str.toCharArray();
	for (char temp : c) {
	    switch (temp) {
	    case '0':
		System.out.print("零");
		break;

	    case '1':
		System.out.print("一");
		break;

	    case '2':
		System.out.print("二");
		break;

	    case '3':
		System.out.print("三");
		break;

	    case '4':
		System.out.print("四");
		break;

	    case '5':
		System.out.print("五");
		break;

	    case '6':
		System.out.print("六");
		break;

	    case '7':
		System.out.print("七");
		break;

	    case '8':
		System.out.print("八");
		break;

	    case '9':
		System.out.print("九");
		break;
	    }
	}
	System.out.println();
    }
}
