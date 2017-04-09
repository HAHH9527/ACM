package date20170318.digui;

import java.util.Scanner;

public class T1 {

    public static String digui(String str, String answer, int length) {
	if (length == 0) {
	    answer = answer + str.charAt(length);
	    return answer;
	}
	answer = answer + str.charAt(length);
	length--;
	return digui(str, answer, length);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    String str = sc.next();
	    int length = str.length() - 1;
	    String answer = digui(str, "", length);
	    System.out.println(answer);
	}
    }
}
