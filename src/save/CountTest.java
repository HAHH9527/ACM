/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

/**
 * ͳ������ ��ĸ ����
 *
 * @author 9527number
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountTest {

    public static void main(String args[]) {
        String str = "asdvdfdDERE123ABCD0012587��һ��������";
        System.out.println("Numbers:" + countNumber(str));
        System.out.println("Letters:" + countLetter(str));
        System.out.println("Chinese:" + countChinese(str));
    }

    public static int countNumber(String str) {
        int count = 0;
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int countLetter(String str) {
        int count = 0;
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int countChinese(String str) {
        int count = 0;
        Pattern p = Pattern.compile("[\\u4e00-\\u9fa5]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

}
