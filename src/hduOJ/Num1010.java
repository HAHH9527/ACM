package hduOJ;

import java.util.Scanner;

public class Num1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            int second = sc.nextInt();
            //读取换行符
            String s = sc.nextLine();
            if (row == 0 && column == 0 && second == 0)
                break;
            //迷宫
            char[][] c = new char[row][column];
            int[][] flag = new int[row][column];
            int x = 0, y = 0;
            int dx = 0, dy = 0;
            int count = 0;//记录可以走的点树数
            for (int i = 0; i < row; i++) {
                String data = sc.nextLine();
                for (int j = 0; j < column; j++) {
                    c[i][j] = data.charAt(j);
                    if (c[i][j] == 'S') {
                        x = i;
                        y = j;
                    } else if (c[i][j] == '.')
                        count++;
                    else if (c[i][j] == 'D') {
                        count++;
                        dx = i;
                        dy = j;
                    }
                }
            }
            //最小步数
            int minStep = Math.abs(dy - y) + Math.abs(dx - x);
            //如果可以走的点数少于second（门开的时间），不可达,或者最小步数都大于时间，也不可达
            if (count < second || minStep > second) {
                System.out.println("NO");
            } else {
                String result;
                if (dfs(row, column, second, x, y, 0, c, flag, dx, dy))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
    }

    private static boolean dfs(int row, int column, int second, int x, int y, int current, char[][] c, int[][] flag, int dx, int dy) {
        if (x >= 0 && x < row && y >= 0 && y < column && c[x][y] == 'D' && second == current)
            return true;
        if (x >= 0 && x < row && y >= 0 && y < column && c[x][y] != 'X' && flag[x][y] == 0) {
            //如果当前到达的点离终点的最短距离大于剩余的秒数，剪枝
            int minStep = Math.abs(dy - y) + Math.abs(dx - x);
            if (minStep > second - current)
                return false;
                //目的地的步数一定等于两点之间的最短距离加上一个偶数
                //如果当前点到目的地的最短距离 + 剩余的步数等于偶数，剪枝
            else if ((second - current - minStep) % 2 != 0)
                return false;
            flag[x][y] = 1;
            //上搜索
            boolean b1 = dfs(row, column, second, x - 1, y, current + 1, c, flag, dx, dy);
            if (b1) return b1;

            //左搜索
            boolean b2 = dfs(row, column, second, x, y - 1, current + 1, c, flag, dx, dy);
            if (b2) return b2;

            //下搜索
            boolean b3 = dfs(row, column, second, x + 1, y, current + 1, c, flag, dx, dy);
            if (b3) return b3;

            //右搜索
            boolean b4 = dfs(row, column, second, x, y + 1, current + 1, c, flag, dx, dy);
            if (b4) return b4;

            flag[x][y] = 0;
            return false;
        } else {
            return false;
        }
    }
}
