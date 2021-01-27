package com.cici.datastruct.heap.bigFileTopN;


/**
 * 进行文件的分区操作，以hash取模进行分区
 */
public class PartitionFile {


    /** 分隔的实例信息 */
    public static final PartitionFile INSTANCE = new PartitionFile();

    /***
     * 分割成64个文件
     */
    private static final int MAX_PARTITION_SIZE = 4;

    /**
     * 分区的文件夹名称
     */
    private static final String PARTITION_DIR_NAME = "partition";

    /**
     * 中间的临时分割文件
     */
    private static final String SUFFIXE_NAME = ".buffer";



}
