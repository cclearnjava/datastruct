package com.cici.datastruct.hash;


import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 虚拟节点的一致性hash算法
 */
public class ConsistentHashingVirtualNode {

    private static String[] servers = { "192.168.3.1:8080", "192.168.3.2:8081", "192.168.99.100:8083", "192.168.99.200:80"};

    /**
     * 服务器节点信息，涉及动态上线与下线节点，采用linkedList比较合适
     */
    private static final List<String> SERVICE_NODE = new LinkedList<>();


    /** 使用有序数据的节点 */
    private static final SortedMap<Integer, String> VIRTUAL_NODE = new TreeMap<>();


    /** 一台服务器对应的虚拟节点数 */
    private static final int VIRTUAL_NUM = 20;

    static{
        //将服务器加入服务器节点
        for(int i = 0;i <servers.length;i++){
            SERVICE_NODE.add(servers[i]);
        }

        //生成虚拟服务器节点
        for(String serverIp :SERVICE_NODE){
            for(int i = 0;i <VIRTUAL_NUM;i++){
                String virtualNodeName = serverIp + "" + i;

                VIRTUAL_NODE.put(HashCode.getHash(virtualNodeName),serverIp);
            }
        }

        //添加一个最大值，防止找不到服务器节点
        VIRTUAL_NODE.put(Integer.MAX_VALUE,servers[servers.length - 1]);
    }


    public static String getNode(String requ){
        int hash = HashCode.getHash(requ);
        //得到大于该key的所有map
        SortedMap<Integer,String> sortedMap = VIRTUAL_NODE.tailMap(hash);
        return VIRTUAL_NODE.get(sortedMap.firstKey());
    }
}
