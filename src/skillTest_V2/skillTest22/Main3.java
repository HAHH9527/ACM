package skillTest_V2.skillTest22;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] card = str.toCharArray();
	out: if (card.length == 18) {
	    for (int i = 0; i < card.length - 1; i++) {
		if (card[i] < '0' || card[i] > '9') {
		    break out;
		}
	    }
	    if ((card[17] >= '0' && card[17] <= '9') || card[17] == 'X') {
		if (card[16] % 2 != 0) {
		    System.out.println("男");
		} else {
		    System.out.println("女");
		}
		System.exit(0);
	    }
	}
	System.out.println("请输入正确的身份证号");
    }
}
