package lanQiao.date20170304.lanqiao7;

public class T1 {
    public static void main(String[] args) {
	String temp = "vxvxvxvxvxvxvvx";
	char[] arr = temp.toCharArray();
	int sum = 777;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == 'v') {
		sum += sum;
	    }
	    if (arr[i] == 'x') {
		sum -= 555;
	    }
	    if (sum <= 0) {
		break;
	    }
	}
	System.out.println(sum);
    }
}
