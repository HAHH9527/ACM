package lanQiao.date20170502.lanqiaojuesai.t7;

import java.util.Scanner;

// ������ı�ʶ https://github.com/HAHH9527/ACM_question/blob/master/%E7%AC%AC%E4%B8%83%E5%B1%8A%E8%93%9D%E6%A1%A5%E6%9D%AF%E5%A4%A7%E8%B5%9B%E4%B8%AA%E4%BA%BA%E8%B5%9B%EF%BC%88%E8%BD%AF%E4%BB%B6%E7%B1%BB%EF%BC%89%E5%86%B3%E8%B5%9B%E7%9C%9F%E9%A2%98/Java%E8%AF%AD%E8%A8%80C%E7%BB%84/2/%E6%88%91%E7%9A%84%E7%AD%94%E6%A1%88.png

public class T2 {
    private static void answer(int[] arr) {
        int x = 14 + arr[0] + arr[1] + arr[2];
        int temp = arr[2] + arr[3] + arr[4] + arr[5];
        if (x != temp) {
            return;
        }
        temp = arr[5] + arr[6] + arr[7] + arr[8];
        if (x != temp) {
            return;
        }
        temp = arr[8] + arr[9] + arr[0] + arr[10];
        if (x != temp) {
            return;
        }
        temp = arr[10] + arr[1] + arr[3] + 11;
        if (x != temp) {
            return;
        }
        temp = 11 + arr[4] + arr[6] + 6;
        if (x != temp) {
            return;
        }
        temp = 6 + arr[7] + arr[9] + 14;
        if (x != temp) {
            return;
        }
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        sc.hasNext();
    }

    private static void qpl(int[] arr, int start) {
        if (start == arr.length) {
            // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + "\t");
            // }
            // System.out.println();
            answer(arr);
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, i, start);
                qpl(arr, start + 1);
                swap(arr, i, start);
            }
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13};
        qpl(arr, 0);
    }
}
