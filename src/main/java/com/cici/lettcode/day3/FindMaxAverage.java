package com.cici.lettcode.day3;


/**
 * 滑动窗口：求出子数组的最大平均数
 */
public class FindMaxAverage {

    public static void main(String[] args) {
        int[] arr = new int[]{1,12,-5,-6,50,3,-30,25};
        int k = 4;
        findMaxAverage(arr,k);
    }

    public static double findMaxAverage(int[] arr,int k ){
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < k; i++ ){
            sum += arr[i];
        }
        int maxSum = sum;
        for(int i = k;i < n;i++){
            sum = sum - arr[i-k] + arr[i];
            maxSum =Math.max(maxSum,sum);
        }
        return 1.0 *maxSum /k;

    }
}
