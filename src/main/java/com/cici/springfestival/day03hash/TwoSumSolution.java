package com.cici.springfestival.day03hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hashtable = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int tartget = 9;

    }
}
