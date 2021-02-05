package com.cici.lettcode.day2;


/**
 * 寻找两个有序数组的中位数
 * 放弃了，如果考了也认栽
 */
public class FindMedianSortedArrays {

    public double FindMedianSortedArrays(int[] nums1,int[] nums2){
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength  = length1 + length2;
        if(totalLength % 2 == 1){
            int midIndex = totalLength / 2;
            double median =  getKthElement(nums1,nums2,midIndex+1);
            return median;
        }else {
            int midIndex1 = totalLength /2 -1;
            int midIndex2 = totalLength / 2;
            double median = (getKthElement(nums1,nums2,midIndex1+1)+getKthElement(nums1,nums2,midIndex2+1)) / 2.0;
            return median;
        }
     }

    private double getKthElement(int[] nums1, int[] nums2, int i) {
        return 1d;
    }
}
