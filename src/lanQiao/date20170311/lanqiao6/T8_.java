package lanQiao.date20170311.lanqiao6;

import java.util.Scanner;

public class T8_ {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int w = sc.nextInt();
	int m = sc.nextInt();
	int n = sc.nextInt();
	int[][] temp = new int[w][(n / w) + 1];
	int[] flagm = new int[2];
	int[] flagn = new int[2];
	int flagw = 0;
	int flagh = 0;
	int count = 1;
	boolean LorR = true;
	while ((flagw != w - 1) && (flagh != (n / w))) {
	    temp[flagw][flagh] = count;
	    if (count == m) {
		flagm[0] = flagw;
		flagm[1] = flagh;
	    } else if (count == n) {
		flagn[0] = flagw;
		flagn[1] = flagh;
	    }
	    if (flagw == w - 1) {
		flagh++;
		LorR = false;
	    } else if (LorR) {
		flagw++;
	    } else {
		flagw--;
	    }
	    count++;
	}
	int maxw = 0;
	int minw = 0;
	if (flagm[0] > flagn[0]) {
	    maxw = flagm[0];
	    minw = flagn[0];
	} else {
	    maxw = flagn[0];
	    minw = flagm[0];
	}
	int maxh = 0;
	int minh = 0;
	if (flagm[1] > flagn[1]) {
	    maxw = flagm[1];
	    minw = flagn[1];
	} else {
	    maxw = flagn[1];
	    minw = flagm[1];
	}
	System.out.println((maxw - minw) + (maxh - minh));
    }
}
