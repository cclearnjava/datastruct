package com.cici.datastruct.heap.bigFileTopN.pojo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PartitionBusi {

    private int index;

    private String path;

    /**
     * 文件流输出对象
     */
    private FileWriter outWrite;

    /**
     * 缓冲流输出对象
     */
    private BufferedWriter bufferedWriter;

    /**
     * 文件读取
     */
    private FileReader fileReader;

    /**
     * 缓冲流读取
     */
    private BufferedReader bufferReader;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FileWriter getOutWrite() {
        return outWrite;
    }

    public void setOutWrite(FileWriter outWrite) {
        this.outWrite = outWrite;
    }

    public BufferedWriter getBufferedWriter() {
        return bufferedWriter;
    }

    public void setBufferedWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public BufferedReader getBufferReader() {
        return bufferReader;
    }

    public void setBufferReader(BufferedReader bufferReader) {
        this.bufferReader = bufferReader;
    }
}
