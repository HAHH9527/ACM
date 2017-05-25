package skillTest_V2.skillTest27;

public class Main2 {
    public static void main(String[] args) {
	int[] n = { 0, 2, 3 };
	int x = 1;
	boolean flag = true;
	int[] newN = new int[n.length + 1];
	for (int i = 0; i < n.length; i++) {
	    if (flag) {
		newN[i] = n[i];
		if (x > n[i]) {
		    newN[i + 1] = x;
		    flag = false;
		}
	    } else {
		newN[i + 1] = n[i];
	    }
	}
	for (int i : newN) {
	    System.out.print(i + " ");
	}
    }
}
