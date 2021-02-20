package com.cici.springfestival.day5backtracing;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 回溯算法的组合问题
 * lettcode 77
 */
public class Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }

        Deque<Integer> path = new ArrayDeque<>();
        dfs(n,k,1,path,res);
        return res;
    }

    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        //递归的终止条件
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }

    }
}
