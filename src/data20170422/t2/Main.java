package data20170422.t2;

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
		    // MyLinkList<Integer> temp = list;
		    // list = new MyLinkList<Integer>();
		    // for (int i2 = temp.size - 1; i2 >= 0; i2--) {
		    // list.add(temp.get(i2));
		    // }
		    if (flag) {
			flag = false;
		    } else {
			flag = true;
		    }
		}
	    }
	    long sum = 0;
	    {
		if (flag) {
		    for (int i = 0; i < list.size; i += 2) {
			sum += list.get(i);
		    }
		} else {
		    for (int i = list.size - 1; i >= 0; i -= 2) {
			sum += list.get(i);
		    }
		}

	    }

	    System.out.println(sum);
	}
    }
}
