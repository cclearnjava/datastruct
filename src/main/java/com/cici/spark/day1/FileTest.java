package com.cici.spark.day1;

import java.io.IOException;

public class FileTest {

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        } else {
            return reference;
        }
    }


    /**
     * 使用FileWriter写入文件
     * @param filePath
     * @param content
     * @throws IOException
     */
    public static void fileWriterMethod(String filePath,String content) throws IOException{

    }

}
