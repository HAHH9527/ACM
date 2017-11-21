package eightQueens;

public class EightQueens {
    private static int[][] m = new int[8][8];
    private static int count = 0;

    public static void main(String[] args) {

    }

    private static boolean check(int row, int column) {
        boolean flag = true;

        // 判断是否有同列
        for (int tempRow = 0; tempRow <= row - 1; tempRow++) {
            if (m[tempRow][column] == 1) {
                flag = false;
            }
        }

        // 判断左上至右下
        for (int tempRow = row - 1, tempColumn = column - 1; tempRow >= 0 && tempColumn >= 0; tempRow--, tempColumn--) {
            if (m[tempRow][tempColumn] == 1) {
                flag = false;
            }
        }

        // 判断左下至右上
        for (int tempRow = row + 1, tempColumn = column - 1; tempRow <= 7 && tempColumn >= 0; tempRow++, tempColumn--) {
            if (m[tempRow][tempColumn] == 1) {
                flag = false;
            }
        }

        return flag;
    }

    private static void solve(int row) {
        for (int column = 0; column <= 7; column++) {
            if (check(row, column)) {

            }
        }
    }
}
