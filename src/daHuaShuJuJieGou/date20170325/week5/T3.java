package daHuaShuJuJieGou.date20170325.week5;

public class T3 {
    public static void main(String[] args) {
	int count = 0;
	for (int x = 10000; x <= 99999; x++) {
	    if (sushu(x) && huiwenshu(x)) {
		count++;
		System.out.println(x);
	    }
	}
	System.out.println(count);
    }

    public static boolean sushu(int x) {
	boolean flag = true;
	for (int temp = 2; temp < x; temp++) {
	    if (x % temp == 0) {
		flag = false;
	    }
	}
	return flag;
    }

    public static boolean huiwenshu(int x) {
	boolean flag = true;
	String str = String.valueOf(x);
	char[] ch = str.toCharArray();
	if (ch[0] != ch[4] || ch[1] != ch[3]) {
	    flag = false;
	}
	return flag;
    }
}
