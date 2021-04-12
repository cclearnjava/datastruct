package com.cici.springfestival.day03hash;


import java.util.ArrayList;
import java.util.List;

/**
 * lettcode 349  两个数组的交集
 * 输出中的每个元素都是唯一的，也就是说输出的结果是去重的， 不考虑输出结果的顺序
 */
public class ArraysIntersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i]) && !list2.contains(nums2[i])) {
                list2.add(nums2[i]);
            }
        }
        return list2.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(intersection(nums1,nums2));
    }
}
