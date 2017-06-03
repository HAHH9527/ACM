package date20170603.HDOJ;

import java.util.Scanner;
import java.util.TreeSet;

public class Num1003 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    String str = sc.nextLine();
	    if (str.equals("#")) {
		continue;
	    }
	    String[] array = str.split(" ");
	    TreeSet<String> set = new TreeSet<String>();
	    for (String string : array) {
		if (string.equals("")) {
		    continue;
		}
		set.add(string);
	    }
	    System.out.println(set.size());
	}
    }
}
