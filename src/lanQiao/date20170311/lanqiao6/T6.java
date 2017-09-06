package lanQiao.date20170311.lanqiao6;

public class T6 {
    public static void main(String[] args) {
	boolean flag = false;
	out: for (int i = 47; true; i++) {
	    char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	    int temp1 = i * i;
	    int temp2 = i * i * i;
	    char[] temp1_c = String.valueOf(temp1).toCharArray();
	    char[] temp2_c = String.valueOf(temp2).toCharArray();
	    for (int j = 0; j < temp1_c.length; j++) {
		for (int j2 = 0; j2 < ch.length; j2++) {
		    if (temp1_c[j] == ch[j2]) {
			ch[j2] = ' ';
		    }
		}
	    }
	    for (int j = 0; j < temp2_c.length; j++) {
		for (int j2 = 0; j2 < ch.length; j2++) {
		    if (temp2_c[j] == ch[j2]) {
			ch[j2] = ' ';
		    }
		}
	    }
	    for (int j = 0; j < ch.length; j++) {
		if (ch[j] != ' ') {
		    flag = false;
		    break;
		}
		if (j == ch.length - 1) {
		    flag = true;
		    System.out.println(i);
		    break out;
		}
	    }
	}
    }
}
