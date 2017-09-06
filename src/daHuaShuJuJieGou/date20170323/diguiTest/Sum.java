package daHuaShuJuJieGou.date20170323.diguiTest;

public class Sum {
    public static int f3(int a[], int begin, int end) {
	if (begin == end) {
	    return a[begin];
	} else if (begin == end - 1) {
	    return a[begin] + a[end];
	} else {
	    return a[begin] + a[end] + f3(a, ++begin, --end);
	}
	// if (begin == end) {
	// return a[begin];
	// }
	// return a[begin] + f3(a, ++begin, end);
    }

    public static void main(String[] args) {
	int[] a = { 1, 2, 3, 4, 5, 6 };
	int sum = f3(a, 0, a.length - 1);
	System.out.println(sum);
    }
}
