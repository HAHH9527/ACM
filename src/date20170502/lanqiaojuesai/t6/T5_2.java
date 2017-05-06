package date20170502.lanqiaojuesai.t6;

import java.util.Scanner;

public class T5_2 {
    private static int[][] allPassword;
    private static String s;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    // long startTime = System.currentTimeMillis();// 获取当前时间
	    s = sc.next();
	    int n = sc.nextInt();
	    allPassword = new int[n][26];
	    for (int i = 0; i < n; i++) {
		String str = sc.next();
		char[] aPassword = str.toCharArray();
		allPassword[i] = passwordFun(aPassword);
	    }
	    answer();
	    allPassword = null;
	    s = "";
	    // long endTime = System.currentTimeMillis();
	    // long runTime = endTime - startTime;
	    // System.out.println("查询运行时间毫秒数是: " + runTime + "ms");
	    // System.out.println("运行时间是: " + formatDuring(runTime));
	}
	// System.out.println((int) 'a' - 97);
	// System.out.println((int) 'z' - 97);
    }

    private static int[] passwordFun(char[] aPassword) {
	int[] ret = new int[26];
	for (int i = 0; i < aPassword.length; i++) {
	    int flag = (int) aPassword[i] - 97;
	    ret[flag]++;
	}
	// for (int i = 0; i < ret.length; i++) {
	// System.out.println((char) (i + 97) + ":" + ret[i]);
	// }
	return ret;
    }

    private static void answer() {
	int count = 0;
	while (s.length() >= 8) {
	    String tempPasswordStr = s.substring(0, 8);
	    char[] tempPasswordChar = tempPasswordStr.toCharArray();
	    int[] tempPasswordInt = passwordFun(tempPasswordChar);
	    // for (int i = 0; i < tempPasswordInt.length; i++) {
	    // System.out.print((char) (i + 97) + ":" + tempPasswordInt[i] +
	    // "\t");
	    // }
	    // System.out.println();
	    for (int i = 0; i < allPassword.length; i++) {
		boolean flag = true;
		for (int i2 = 0; i2 < tempPasswordInt.length; i2++) {
		    if (tempPasswordInt[i2] != allPassword[i][i2]) {
			flag = false;
			break;
		    }
		}
		if (flag) {
		    count++;
		}
		// if (allPassword[i].equals(tempPasswordInt)) {
		// count++;
		// }
	    }
	    s = s.substring(1);
	}
	System.out.println(count);
    }

    // public static String formatDuring(long mss) {
    // long days = mss / (1000 * 60 * 60 * 24);
    // long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
    // long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
    // long seconds = (mss % (1000 * 60)) / 1000;
    // return days + " days " + hours + " hours " + minutes + " minutes " +
    // seconds + " seconds ";
    // }
}
