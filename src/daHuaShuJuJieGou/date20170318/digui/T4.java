package daHuaShuJuJieGou.date20170318.digui;

import java.util.Scanner;

public class T4 {
    public static int digui(int count, int length, char[] ch, String str) {
	if (length == ch.length - 1) {
	    if (str.indexOf(ch[length]) >= 0) {
		count++;
		str = str.substring(str.indexOf(ch[length]), str.length());
	    }
	    return count;
	}
	if (str.indexOf(ch[length]) >= 0) {
	    count++;
	    str = str.substring(str.indexOf(ch[length]), str.length());
	}
	length++;
	return digui(count, length, ch, str);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    String str1 = sc.next();
	    String str2 = sc.next();
	    if (str2.length() > str1.length()) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
	    }
	    char[] ch = str2.toCharArray();
	    int answer = digui(0, 0, ch, str1);
	    System.out.println(answer);
	}
    }
}
