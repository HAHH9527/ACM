package date20170325.week5;

public class T4 {
    public static void main(String[] args) {
	int x1 = 0;// 让
	int x2 = 0;// 我
	int x3 = 0;// 怎
	int x4 = 0;// 能
	int x5 = 0;// 过
	int x6 = 0;// 大
	int x7 = 0;// 年
	out: for (; x1 < 10; x1++) {
	    for (; x2 < 10; x2++) {
		for (; x3 < 10; x3++) {
		    for (; x4 < 10; x4++) {
			for (; x5 < 10; x5++) {
			    for (; x6 < 10; x6++) {
				for (; x7 < 10; x7++) {
				    if ((x1 * 1 * 1000000 + x2 * 2 * 100000 + x3 * 3 * 10000 + x4 * 4 * 1000
					    + x5 * 5 * 100 + x6 * 6 * 10 + x7 * 7) == x4 * 1000000 + x4 * 100000
						    + x4 * 10000 + x4 * 1000 + x4 * 100 + x4 * 10 + x4) {
					System.out.print(x1);
					System.out.print(x2);
					System.out.print(x3);
					System.out.print(x4);
					System.out.print(x5);
					System.out.print(x6);
					System.out.print(x7);
					System.out.println();
				    }
				}
				x7 = 0;
			    }
			    x6 = 0;
			}
			x5 = 0;
		    }
		    x4 = 0;
		}
		x3 = 0;
	    }
	    x2 = 0;
	}
	x1 = 0;
    }
}
