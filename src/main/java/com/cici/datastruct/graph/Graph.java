package com.cici.datastruct.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    //顶点的个数
    private int v;

    //邻接表信息
    private LinkedList<Integer>[] adj;

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            //初始化邻接表数组
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) { //无向图
        adj[s].add(t);
        adj[t].add(s);
    }

    /**
     * 广度优先探索算法
     * s :起始顶点
     * t :终止顶点
     */
    public void bfs(int s, int t) {
        if (s == t) {
            return;
        }

        //用来标识已经访问过顶点，避免重复访问
        boolean[] visited = new boolean[v];
        visited[s] = true;

        //队列用来存储已经被访问，但是相邻还没有被访问的顶点
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        //记录搜索的路径
        int[] prev = new int[v];
        //将记录搜索的路径，初始化为-1
        for (int i = 0; i < v; i++) {
            prev[v] = -1;
        }

        while (queue.size() != 0) {
            int w = queue.poll(); //移除并返回头部的元素
            System.out.println(w); //队列的值为w
            //遍历顶点链
            for (int i = 0; i < adj[w].size(); i++) {
                //遍历当前顶点关联的顶点
                int q = adj[w].get(i);
                //如果当前没有被访问过
                if (!visited[q]) {
                    prev[q] = w; //当前从哪个顶点过来的，是一条顶点链
                    System.out.println("当前的q:" + q);
                    System.out.println(Arrays.toString(prev));
                    if (q == t) {
                        print(prev, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }

    //全局变量
    boolean found = false;

    /**
     * 深度优先算法(回溯思想）
     *
     * @param s
     * @param t
     */
    public void dfs(int s, int t) {
        found = false;
        //用来标识已经访问过顶点，避免重复访问
        boolean[] visited = new boolean[v];
        //记录搜索的路径
        int[] prev = new int[v];
        for (int i = 0; i < v; i++){
            prev[i] = -1;
        }
        recurDfs(s,t,visited,prev);
        print(prev,s,t);

    }

    private void recurDfs(int s, int t, boolean[] visited, int[] prev) {
        if(found){
            return;
        }
        visited[s] = true;
        if(s == t){
            found = true;
            return;
        }

        for(int i = 0; i < adj[s].size();i++){
            int q = adj[s].get(i);
            //如果当前从未被访问过
            if(!visited[q]){
                prev[q] = s;
                recurDfs(q,t,visited,prev);
            }
        }
    }

    private void print(int[] prev, int s, int t) {
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.print(t + " ");
    }


}
