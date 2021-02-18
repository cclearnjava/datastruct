package com.cici.springfestival.day04;


/**
 * letcode 27  移除元素
 */
public class RemoveElement {

    /**
     * 双指针法
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }


}
