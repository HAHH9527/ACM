package skillTest_V2.skillTest23;

import java.util.Iterator;

public class Main2 {
    private static void bs(int[] a) {
	for (int i = 0; i < a.length - 1; i++) {
	    for (int i2 = 0; i2 < a.length - 1 - i; i2++) {
		if (a[i2] > a[i2 + 1]) {
		    int temp = a[i2];
		    a[i2] = a[i2 + 1];
		    a[i2 + 1] = temp;
		}
	    }
	}
    }

    public static void main(String[] args) {
	int[] a = { 1, 9, 3, 7, 4, 2, 5, 0, 6, 8 };
	bs(a);
    }
}
