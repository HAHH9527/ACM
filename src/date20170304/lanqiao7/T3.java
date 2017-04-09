package date20170304.lanqiao7;

public class T3 {
    public static void main(String[] args) {
	int temp = 234;
	for (; true;) {
	    String temp2 = String.valueOf(temp);
	    char[] arr = temp2.toCharArray();
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
		int temp3 = arr[i] - 48;
		sum += temp3 * temp3;
	    }
	    System.out.println(sum);
	    temp = sum;
	}
    }
}
