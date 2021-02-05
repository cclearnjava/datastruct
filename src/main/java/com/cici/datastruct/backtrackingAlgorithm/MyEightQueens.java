package com.cici.datastruct.backtrackingAlgorithm;



/***
 * 进行八皇后的问题求解
 */
public class MyEightQueens {

    private static final int QUEEN_SIZE = 8;

    /**
     * 用来进行队列结果的存储
     */
    private static int[] result = new int[QUEEN_SIZE];

    public static void main(String[] args) {
        call8Queens(5);
    }

    public static void call8Queens(int row) {
        if (row == QUEEN_SIZE) {
            print(result);
            return;
        }

        //遍历当前的列
        for (int column = 0; column < QUEEN_SIZE; column++) {
            //检查当前是否满足要求，如果满足，设置result，并进行下一轮的遍历
            if (isOk(row, column)) {
                result[row] = column;
                call8Queens(row + 1);
            }
        }
    }

    /***
     * 检查当前行列是否满足要求
     * @param row  行信息
     * @param column 列信息
     * @return
     */
    private static boolean isOk(int row, int column) {
        int leftUp = column - 1;
        int rightUp = column + 1;
        //按行逐渐向上遍历
        for (int i = row - 1; i >= 0; --i) {
            //检查当前行是否已经设置
            if(result[i] == column){
                return false;
            }
            //检查左上部分是否被放置了棋子
            if(leftUp >= 0 && result[i] == leftUp){
                return false;
            }

            if(rightUp < QUEEN_SIZE && result[i] == rightUp){
                return false;
            }
            leftUp -- ;
            rightUp ++;
        }
        return true;
    }

    private static void print(int[] result) {
        for (int row = 0; row < QUEEN_SIZE; row++) {
            for (int column = 0; column < QUEEN_SIZE; column++) {
                if (result[row] == column) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
