package com.cici.springfestival.day1;


/**
 * 螺旋矩阵 2
 */
public class GenerateMatrix {

    public static int[][] generateMatrix(int n) {
        int l = 0;
        int r = n - 1;
        int t = 0;
        int b = n - 1;

        int[][] mat = new int[n][n];
        int num = 1;
        int tar = n * n;

        while (num <= tar) {
            for (int i = l; i <= r; i++) {  //left to right ???
                mat[t][i] = num++;
                System.out.println(mat[t][i]);
            }
            t++;
            for (int i = t; i <= b; i++) {// top to bottom.
                mat[i][r] = num++;
                System.out.println(mat[i][r]);
            }
            r--;
            for (int i = r; i >= l; i--) {// right to left.
                mat[b][i] = num++;
                System.out.println(mat[b][i]);
            }
            b--;
            for (int i = b; i >= t; i--) {// bottom to top.
                mat[i][l] = num++;
                System.out.println(mat[i][l]);
            }
            l++;
        }
        return mat;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
