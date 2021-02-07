package com.cici.springfestival.day1;

/**
 * 移除数组中的对应元素，并返回移除后的长度
 */
public class RemoveElement {

    /**
     * 方法一
     * @param nums
     * @param target
     * @return
     */
    public static int RemoveElement(int[] nums, int target) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != target) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    /***
     * 方法二
     * @param nums
     * @param target
     * @return
     */
    public static int RemoveElement1(int[] nums,int target){
            int i = 0;
            int n = nums.length;
            while (i  < n){
                if(nums[i] == target){
                    nums[i] = nums[n - 1]; //数组的结尾元素跟当前的元素换位置
                    n--;
                }else {
                    i++;
                }
            }
            return n;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 2, 4, 5, 2, 4};
        int target = 4;
        System.out.println(RemoveElement(nums, target));
    }
}
