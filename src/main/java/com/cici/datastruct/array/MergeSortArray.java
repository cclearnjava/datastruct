package com.cici.datastruct.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 进行两个有序数组的合并操作
 */
public class MergeSortArray {

    public static void main(String[] args) {
        int[] nums1 = {12, 32, 63, 84, 105};
        int[] nums2 = {12, 32, 53, 74, 95};
        merge(nums1, nums2);
    }

    /**
     * 合并两个有序的数组
     *
     * @param nums1
     * @param nums2
     */
    public static void merge(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int lenght2 = nums2.length;

        int newArraylength = length1 + lenght2;
        int[] result = new int[newArraylength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < length1 && j < lenght2) {
          /*  if(nums1[i] <= nums2[j]){
                result[k++] = nums1[i++];
            }else {
                result[k++] = nums2[j++];
            }*/

            /* 去重复元素，但是空间利用率还是浪费啦，看结果后面有默认的2个0显示 */
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else if (nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                //在某个位置上2个值相等的话，取哪个都一样，
                // 然后这个相等的位置的2个值都可以不用比啦，都直接向后移动1，继续比较
                j++;
                i++;
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            result[k++] = nums1[j++];
        }

        System.out.println(Arrays.toString(result));
    }



}

