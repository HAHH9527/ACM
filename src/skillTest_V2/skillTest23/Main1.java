package skillTest_V2.skillTest23;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	boolean flag3 = false, flag5 = false, flag7 = false;
	if (x % 3 == 0) {
	    flag3 = true;
	}
	if (x % 5 == 0) {
	    flag5 = true;
	}
	if (x % 7 == 0) {
	    flag7 = true;
	}
	if (flag3 && flag5 && flag7) {
	    System.out.println("能同时被3、5、7整除");
	} else if (flag3 && flag5) {
	    System.out.println("能同时被3、5整除");
	} else if (flag3 && flag7) {
	    System.out.println("能同时被3、7整除");
	} else if (flag5 && flag7) {
	    System.out.println("能同时被5、7整除");
	} else if (flag3 || flag5 || flag7) {
	    System.out.println("只能被3、5、7中的一个整除");
	} else {
	    System.out.println("不能被3、5、7任一个整除");
	}
    }
}
