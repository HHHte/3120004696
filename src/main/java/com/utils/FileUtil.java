package com.utils;

import com.exception.FileException;


import java.io.FileReader;
import java.io.IOException;

import java.io.*;


public class FileUtil {
    /**
     * 读取路径
     *
     * @param filepath 文件路径
     * @throws FileException 异常
     */
    public static void readFile(String filepath) throws FileException {
        if (filepath == null || "".equals(filepath)) {
            throw new FileException("文件路径为空");
        }
        try {
            new FileReader(filepath);
        } catch (Exception e) {
            throw new FileException("文件为空");
        }
        System.out.println(new File(filepath).getName());

    }

    /**
     * 输出结果
     *
     * @param filepath 文件路径
     * @param content  结果
     * @throws FileException 异常
     */
    public static void writeFile(String filepath, String content) throws FileException {
        if (filepath == null || "".equals(filepath)) {
            throw new FileException("文件路径为空");
        }

        try {
            //指定文件
            File file = new File(filepath);
            //创建输出流fos并以file为参数
            FileOutputStream fos = new FileOutputStream(file);
            //创建字符输出流对象osw并以fos为参数
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            //创建一个带缓冲的输出流对象bw，并以osw为参数
            BufferedWriter bw = new BufferedWriter(osw);
            //使用bw写入一行文字，为字符串形式String
            bw.write(content);
            //关闭并保存
            bw.close();
        } catch (Exception e) {
            System.out.println("输出路径必须为目标文件，不能为目录");
        }

    }
}
