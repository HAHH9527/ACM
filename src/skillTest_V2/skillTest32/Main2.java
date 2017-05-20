package skillTest_V2.skillTest32;

public class Main2 {
    public static void main(String[] args) {
	for (int i = 0; i < 2000; i++) {
	    if (10000 - (i * 23) == 9931) {
		System.out.println("合格电视数量：" + (2000 - i));
		break;
	    }
	}
    }
}
