package data20170422.t2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int n = sc.nextInt();
	    MyLinkList<Integer> list = new MyLinkList<Integer>();
	    boolean flag = true;
	    for (int i = 1; i <= n; i++) {
		list.add((Integer) i);
	    }
	    int m = sc.nextInt();
	    for (int i = 0; i < m; i++) {
		int command = sc.nextInt();
		if (command == 1) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int xFlag = list.search(x);
		    int yFlag = list.search(y);
		    if (xFlag != yFlag - 1) {
			list.del(xFlag);
			yFlag = list.search(y);
			list.add(yFlag - 1, x);
		    }
		} else if (command == 2) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int xFlag = list.search(x);
		    int yFlag = list.search(y);
		    if (xFlag != yFlag + 1) {
			list.del(xFlag);
			yFlag = list.search(y);
			list.add(yFlag, x);
		    }
		} else if (command == 3) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int xFlag = list.search(x);
		    int yFlag = list.search(y);
		    list.del(xFlag);
		    list.add(xFlag - 1, y);
		    list.del(yFlag);
		    list.add(yFlag - 1, x);
		} else if (command == 4) {
		    if (flag) {
			flag = false;
		    } else {
			flag = true;
		    }
		}
	    }
	    long sum = 0;
	    {
		Integer[] temp = list.toArrary();
		if (flag) {
		    for (int i = 0; i < temp.length; i += 2) {
			sum += temp[i];
		    }
		} else {
		    for (int i = temp.length - 1; i >= 0; i -= 2) {
			sum += temp[i];
		    }
		}
	    }
	    System.out.println(sum);
	}
    }
}
