package com.cici.lettcode.day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hashtable = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};   //创建数组时，不指定数组大小则必须在创建的同时初始化数组
            }
            hashtable.put(nums[i],i); //这一步的作用是什么。不会让x 和自己匹配的吗
        }
        return new int[0];
     }
}
