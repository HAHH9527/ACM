/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                String inID = "";
                String[] inTime = {"23", "59", "59"};
                String outID = "";
                String[] outTime = {"00", "00", "00"};
                String[] temp = new String[3];
                for (int j = 0; j < m; j++) {
                    String tempID = sc.next();
                    String tempInTime = sc.next();
                    temp = tempInTime.split(":");
                    for (int k = 0; k < 3; k++) {
                        if (Integer.valueOf(temp[k]) < Integer.valueOf(inTime[k])) {
                            inTime = temp;
                            inID = tempID;
                            break;
                        }
                    }
                    String tempOutTime = sc.next();
                    temp = tempOutTime.split(":");
                    for (int k = 0; k < 3; k++) {
                        if (Integer.valueOf(temp[k]) > Integer.valueOf(outTime[k])) {
                            outTime = temp;
                            outID = tempID;
                            break;
                        }
                    }
                }
                System.out.println(inID + " " + outID);
            }
        }
    }
}
