package com.utils;

import com.exception.FileException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    /**
     * 读取路径
     *
     * @param filepath 文件路径
     * @return 结果
     * @throws FileException 异常
     */
    public static String readFile(String filepath) throws FileException {
        if (filepath == null || "".equals(filepath)) {
            throw new FileException("文件路径为空");
        }
        FileReader fileReader;
        try {
            fileReader = new FileReader(filepath);
        } catch (Exception e) {
            throw new FileException("文件为空");
        }
        String result = String.valueOf(fileReader);
        System.out.println(result);
        return result;
    }

    /**
     * 输出结果
     *
     * @param filepath 文件路径
     * @param content  结果
     * @return true
     * @throws IOException 异常
     */
    public static Boolean writeFile(String filepath, String content) throws IOException {
        FileWriter writer = new FileWriter(filepath);
        try {
            writer.write(content);
        } catch (Exception e) {
            System.out.println("答案文件输出异常，结果为：" + content);
        }
        return true;
    }
}
