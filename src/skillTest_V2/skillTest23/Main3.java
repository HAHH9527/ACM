package skillTest_V2.skillTest23;

import java.util.LinkedList;
import java.util.Scanner;

public class Main3 {
    private static int[] baoShu(int n, int m) {
        int[] ret = new int[n];
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int count = 0;
        int i = 0;
        while (list.isEmpty() == false) {
            count++;
            int temp = list.pollLast();
            if (count == m) {
                ret[i] = temp;
                i++;
                count = 0;
            } else {
                list.push(temp);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��������������");
        int n = sc.nextInt();
        System.out.print("������m��");
        int m = sc.nextInt();
        int[] x = baoShu(n, m);
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
