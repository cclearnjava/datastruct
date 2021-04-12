package com.cici.springfestival.day08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len == 0){
            return res;
        }
        
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);
        return res;
    }


    /**
     *
     * @param candidates 候选数组
     * @param begin  搜索的七点
     * @param len
     * @param target
     * @param path
     * @param res
     */
    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if(target < 0){
            return;
        }

        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = begin;i < len;i++){
            path.addLast(candidates[i]);

            dfs(candidates,i,len,target-candidates[i],path,res);

            path.removeLast();
        }
    }

}
