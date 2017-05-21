package skillTest_V2.skillTest34;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] input = str.split(" ");
	TreeSet<String> set = new TreeSet<String>();
	for (String temp : input) {
	    set.add(temp);
	}
	System.out.println(set.size());
    }
}
