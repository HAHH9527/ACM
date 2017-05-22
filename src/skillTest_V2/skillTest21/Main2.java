package skillTest_V2.skillTest21;

public class Main2 {
    public static void main(String[] args) {
	for (int i = 100; i <= 200; i++) {
	    String str = String.valueOf(i);
	    char[] c = str.toCharArray();
	    if (c[0] == c[2]) {
		System.out.println(i);
	    }
	}
    }
}
