package hduOJ.date20171209;

import java.util.ArrayList;
import java.util.Scanner;

//此方法暴力查找，遍历计数startsWith，因为数据量很大，会超时
public class Num1009_TLE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String word = sc.nextLine();
            if (word.equals("")) {
                break;
            }
            arrayList.add(word);
        }
        Object[] arr = arrayList.toArray();
        while (sc.hasNext()) {
            String prefix = sc.next();
            int count = 0;
            for (Object word : arr) {
                if (String.valueOf(word).startsWith(prefix)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
