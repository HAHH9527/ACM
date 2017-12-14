package hduOJ.date20171209;

import java.util.HashMap;
import java.util.Scanner;

//Map方法，输入一个单词就将单词拆开成(0,1),(0,2)...(0,n)存入Map，最后从Map取得数据即可
public class Num1009_Map {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String word = sc.nextLine();
            if (word.equals("")) {
                break;
            }
            for (int i = 0; i < word.length() + 1; i++) {
                String temp = word.substring(0, i);
                if (map.get(temp) == null) {
                    map.put(temp, 1);
                } else {
                    map.put(temp, map.get(temp) + 1);
                }
            }
        }
        while (sc.hasNext()) {
            String beginIndex = sc.next();
            int count = 0;
            try {
                count = map.get(beginIndex);
            } catch (Exception e) {

            }
            System.out.println(count);
        }
    }
}
