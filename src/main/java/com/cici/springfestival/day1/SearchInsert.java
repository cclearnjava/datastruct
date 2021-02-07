package com.cici.springfestival.day1;

/**
 * letcode  35
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        //特殊例子
        if (nums[len - 1] < target) {  //如果target值 大于排序数组的最后一个值，那就直接添加到最后面
            return len;
        }

        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;


    }
}
