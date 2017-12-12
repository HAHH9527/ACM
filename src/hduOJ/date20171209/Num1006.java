package hduOJ.date20171209;

import java.util.HashSet;
import java.util.Scanner;

public class Num1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("#")) {
                break;
            }
            HashSet<String> set = new HashSet<>();
            String[] arr = str.split(" ");
            for (String temp : arr) {//增强型for循环,目的是遍历arr
                if (!temp.equals("")) {
                    //这个是判断temp是否为""空字符串，原因可以遍历输出arr试试，再试试用"=="判断
                    set.add(temp);
                }
            }
            System.out.println(set.size());
        }
    }
}
