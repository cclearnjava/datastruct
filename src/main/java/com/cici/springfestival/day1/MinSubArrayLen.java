package com.cici.springfestival.day1;


/***
 *
 *  209
 * 给定一个含有n个正整数的数组和正整数s，找出该数组中满足其和 >= s的长度最小的连续子数组，并返回其长度
 * 如果不存在符合条件的字数组，返回0
 */
public class MinSubArrayLen {

    public static int minSubArrayLen(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int sum = 0; //滑动窗口数组的和
        int i = 0;//滑动的起始位置
        int subLength = 0;//滑动窗口的长度
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLength = (j - i + 1);
                min = min < subLength ? min : subLength;
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int tarage = 7;
        System.out.println(minSubArrayLen(nums,tarage));
    }

}
