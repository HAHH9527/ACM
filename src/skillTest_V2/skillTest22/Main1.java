package skillTest_V2.skillTest22;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入月份：");
	int month = sc.nextInt();
	System.out.print("请输入票数：");
	int ticket = sc.nextInt();
	if (month >= 7 && month <= 9) {
	    if (ticket > 20) {
		System.out.println("优惠15%");
	    } else {
		System.out.println("优惠5%");
	    }
	} else if (month >= 1 && month <= 5) {
	    if (ticket > 20) {
		System.out.println("优惠30%");
	    } else {
		System.out.println("优惠20%");
	    }
	} else if (month >= 1 && month <= 12) {
	    System.out.println("优惠10%");
	} else {
	    System.out.println("请输入正确的月份！");
	}
    }
}
