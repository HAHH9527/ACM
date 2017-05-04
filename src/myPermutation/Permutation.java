package myPermutation;

import java.util.Arrays;

public class Permutation {
    private static void swap(char[] array, int x, int y) {
	char temp = array[x];
	array[x] = array[y];
	array[y] = temp;
    }

    private static void permute(char[] array, int start) {
	if (start == array.length) {
	    System.out.println(Arrays.toString(array));
	} else {
	    for (int i = start; i < array.length; i++) {
		swap(array, start, i);
		permute(array, start + 1);
		swap(array, start, i);
	    }
	}
    }

    public static void main(String[] args) {
	String str = "12345";
	char[] c = str.toCharArray();
	permute(c, 0);
    }
}
