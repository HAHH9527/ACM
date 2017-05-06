package date20170502.lanqiaojuesai.t6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class T5 {
    private static TreeSet<String> setStr = new TreeSet<String>();

    private static void swap(char[] array, int x, int y) {
	char temp = array[x];
	array[x] = array[y];
	array[y] = temp;
    }

    private static void permute(char[] array, int start) {
	if (start == array.length) {
	    String str = "";
	    for (int i = 0; i < array.length; i++) {
		str += String.valueOf(array[i]);
	    }
	    setStr.add(str);
	} else {
	    for (int i = start; i < array.length; i++) {
		swap(array, start, i);
		permute(array, start + 1);
		swap(array, start, i);
	    }
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    String s = sc.next();
	    int n = sc.nextInt();
	    int count = 0;
	    for (int i = 0; i < n; i++) {
		String password = sc.next();
		char[] c = password.toCharArray();
		permute(c, 0);
		for (Iterator<String> iterator = setStr.descendingIterator(); iterator.hasNext();) {
		    String string = (String) iterator.next();
		    int flag = 0;
		    while (true) {
			flag = s.indexOf(string, flag);
			if (flag == -1) {
			    break;
			} else {
			    count++;
			    flag++;
			}
		    }
		}
		setStr.clear();
	    }
	    System.out.println(count);
	}
    }
}
