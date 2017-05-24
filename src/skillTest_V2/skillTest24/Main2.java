package skillTest_V2.skillTest24;

public class Main2 {
    public static void main(String[] args) {
	for (int i = 1; i <= 7; i++) {
	    for (int i2 = 1; i2 <= 7 - i; i2++) {
		System.out.print(" ");
	    }
	    for (int i2 = 1; i2 <= (i - 1) * 2 + 1; i2++) {
		System.out.print("*");
	    }
	    System.out.println();
	}
    }
}
