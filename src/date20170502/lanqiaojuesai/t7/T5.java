package date20170502.lanqiaojuesai.t7;

import java.util.Scanner;

public class T5 {
    private static int[] x;
    private static int[] y;
    private static int n;
    private static boolean flag2 = false;
    private static int[] xCount;
    private static int[] yCount;
    private static int[][] flag;

    private static void f(int nowX, int nowY, int count) {
	if (flag[nowX][nowY] != 0) {
	    return;
	}

	count++;
	flag[nowX][nowY] = count;
	xCount[nowX]++;
	yCount[nowY]++;
	if (xCount[nowX] > x[nowX] || yCount[nowY] > y[nowY]) {
	    returnZero(nowX, nowY);
	    return;
	}

	if (count == n * n - 1) {
	    flag2 = true;
	    return;
	}

	if (nowX + 1 < n && flag[nowX + 1][nowY] == 0) {
	    f(nowX + 1, nowY, count);
	    if (flag2) {
		return;
	    }
	    // returnZero(nowX + 1, nowY);
	}

	if (nowY + 1 < n && flag[nowX][nowY + 1] == 0) {
	    f(nowX, nowY + 1, count);
	    if (flag2) {
		return;
	    }
	    // returnZero(nowX, nowY + 1);
	}

	if (nowX - 1 > 0 && flag[nowX - 1][nowY] == 0) {
	    f(nowX - 1, nowY, count);
	    if (flag2) {
		return;
	    }
	    // returnZero(nowX - 1, nowY);
	}

	if (nowY - 1 > 0 && flag[nowX][nowY - 1] == 0) {
	    f(nowX, nowY - 1, count);
	    if (flag2) {
		return;
	    }
	    // returnZero(nowX, nowY - 1);
	}

    }

    private static void returnZero(int nowX, int nowY) {
	flag[nowX][nowY] = 0;
	xCount[nowX]--;
	yCount[nowY]--;
    }

    private static void getNum(int count) {
	out: for (int iY = 0; iY < n; iY++) {
	    for (int iX = 0; iX < n; iX++) {
		if (flag[iX][iY] == count) {
		    System.out.print((n * iY) + iX);
		}
	    }
	}
	if (count == n * n - 1) {
	    System.out.println();
	    return;
	}
	System.out.print(" ");
	getNum(count + 1);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    n = sc.nextInt();
	    x = new int[n];
	    y = new int[n];
	    xCount = new int[n];
	    yCount = new int[n];
	    for (int i = 0; i < n; i++) {
		x[i] = sc.nextInt();
	    }
	    for (int i = 0; i < n; i++) {
		y[i] = sc.nextInt();
	    }
	    flag = new int[n][n];
	    f(0, 0, 0);
	    getNum(1);
	}
    }
}
