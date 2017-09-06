package lanQiao.date20170502.lanqiaojuesai.t7;

import java.util.TreeSet;

public class T1 {
    public static void main(String[] args) {
	TreeSet<String> setStr = new TreeSet<String>();
	for (long i = 4; i <= 100; i++) {
	    long temp = i * i;
	    String str = String.valueOf(temp);
	    String answer = str.substring(str.length() - 2);
	    System.out.println(i + ":" + str + ":" + answer);
	    setStr.add(answer);
	    System.out.println(setStr.size());
	}
	System.out.println(setStr.toString());
    }
}
