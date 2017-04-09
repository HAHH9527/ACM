package date20170325.week5;

import java.util.Scanner;

public class T6 {

    // public static long minGbs(int a, int b) {
    // if (a > 30)
    // return b;
    // return gbs(a++, b);
    // }

    // static long gbs_30 = setGbs_30();
    //
    // public static long setGbs_30() {
    // long ret = 1;
    // for (int i = 30; i >= 1; i--) {
    // ret = gbs(ret, i);
    // System.out.println(ret);
    // }
    // return ret;
    // }
    //
    // public static long gbs(long a, long b) {
    // return a * b / gys(a, b);
    // }
    //
    // public static long gys(long a, long b) {
    // if (a > b) {
    // long temp = a;
    // a = b;
    // b = temp;
    // }
    // while (b % a != 0) {
    // long temp = b % a;
    // b = a;
    // a = temp;
    // }
    // System.out.println("gys = " + a);
    // return a;
    // }

    static long gbs_30 = 2329089562800l;

    /**
     * 
     * @param arr
     *            存储分母的数组
     * @param k
     *            当前下标位置
     * @param t
     *            前面一个分母
     */
    public static void f2(int arr[], int k, int t) {

	// if (k == arr.length) {
	// long sum = 0;
	// if (res == gbs_30) {
	// for (int i = 0; i < arr.length; i++) {
	// // if (i == arr.length - 1) {
	// // System.out.println("1/" + arr[i]);
	// // } else {
	// // System.out.print("1/" + arr[i] + " ");
	// // }
	// System.out.print(arr[i] + " ");
	// }
	// System.out.println();
	// }
	// return;
	// }
	//
	// if (k == arr.length - 3) {// 在这个位置检查前面的项数和是否超过了1
	// if (res > gbs_30) {
	// return;
	// }
	// }
	if (k == arr.length - 1) {
	    long sum = 0;

	    for (int i = 0; i < arr.length; i++) {
		sum += gbs_30 / (long) arr[i];
		if (sum > gbs_30) {
		    System.out.println("exit");
		    for (int j = 0; j < arr.length - 1; j++) {
			System.out.print("1/" + arr[j] + " ");
		    }
		    System.out.println("1/" + (arr.length - 1));
		    return;
		}
	    }

	    if (sum == gbs_30) {
		for (int i = 0; i < arr.length - 1; i++) {
		    System.out.print("1/" + arr[i] + " ");
		}
		System.out.println(arr.length - 1);
	    }
	    return;
	}

	for (int i = t + 1; i < 30; i++) {// 题目应该是分母不能超过30
	    arr[k] = i;
	    f2(arr, k + 1, i);
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    // System.out.println(gbs_30);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    f2(arr, 0, 0);
	}
    }
}
