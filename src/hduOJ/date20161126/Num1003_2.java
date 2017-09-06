/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1003_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                String inID = "";
                int inTime = 23 * 3600 + 59 * 60 + 59;
                String outID = "";
                int outTime = 0;
                String[] temp = new String[3];
                int time;
                for (int j = 0; j < m; j++) {
                    String tempID = sc.next();
                    String tempInTime = sc.next();
                    temp = tempInTime.split(":");
                    time = Integer.valueOf(temp[0]) * 3600 + Integer.valueOf(temp[1]) * 60 + Integer.valueOf(temp[2]);
                    if (time < inTime) {
                        inTime = time;
                        inID = tempID;
                    }
                    String tempOutTime = sc.next();
                    temp = tempOutTime.split(":");
                    time = Integer.valueOf(temp[0]) * 3600 + Integer.valueOf(temp[1]) * 60 + Integer.valueOf(temp[2]);
                    if (time > outTime) {
                        outTime = time;
                        outID = tempID;
                    }
                }
                System.out.println(inID + " " + outID);
            }
        }
    }
}
