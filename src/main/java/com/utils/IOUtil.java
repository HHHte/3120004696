package com.utils;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.TokenizerEngine;
import cn.hutool.extra.tokenizer.Word;
import cn.hutool.extra.tokenizer.engine.hanlp.HanLPEngine;
import com.exception.FileException;

import java.util.*;

public class IOUtil {

    /**
     * 分词，记录文本
     *
     * @param path 文件路径
     * @return 返回结果集
     */
    public static Map<String, List<Integer>> word(String path) {
        Map<String, List<Integer>> resultMap = new TreeMap<>();
        //初始化分词引擎
        TokenizerEngine engine = new HanLPEngine();

        //读取文件
        try {
            FileUtil.readFile(path);
        } catch (FileException e) {
            System.out.println(e.getMessage());
            return null;
        }

        FileReader fileReader = new FileReader(path, "UTF-8");
        String text = fileReader.readString();
        Result result = engine.parse(text);

        //解析文本
        Iterator<Word> iterator = result.iterator();
        int point = 0;
        while (iterator.hasNext()) {
            String temp = iterator.next().toString();
            String after = "";
            for (int i = 0; i < temp.length(); i++) {
                char a = temp.charAt(i);
                //只取中文
                if (String.valueOf(a).matches("[\u4e00-\u9fa5]")) {
                    after += a;
                }
            }
            if (resultMap.get(after) == null) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(point);
                resultMap.put(after, list);
            }
            List<Integer> tempList = resultMap.get(after);
            //记录新位置
            tempList.add(point);
            point++;
        }
        return resultMap;
    }

    /**
     * 采用余弦来查重
     *
     * @param firstMap  原文
     * @param secondMap 抄袭文
     * @return 返回结果
     */
    public static Double count(Map<String, List<Integer>> firstMap, Map<String, List<Integer>> secondMap) {
        if (firstMap == null || secondMap == null) {
            return null;
        }

        //计算了多少个词
        int count = 0;
        //余弦方程的上部
        double equationUp;
        //余弦方程的下部部分一
        double equationDown1;
        //余弦方程的下部部分二
        double equationDown2;
        //每一个词的相似度之和
        double sum = 0;
        for (String key : firstMap.keySet()) {
            List<Integer> wordOrigin = firstMap.get(key);
            List<Integer> wordCopy = secondMap.get(key);
            if (wordCopy != null) {
                equationUp = equationDown1 = equationDown2 = 0;
                for (int i = 0; i < wordOrigin.size() && i < wordCopy.size(); i++) {
                    Integer pointOrigin = wordOrigin.get(i);
                    Integer pointCopy = wordCopy.get(i);
                    //上部相乘
                    equationUp += pointCopy * pointOrigin;
                    //下部相乘，后开方
                    equationDown1 += pointCopy * pointOrigin;
                    equationDown2 += pointCopy * pointOrigin;
                }
                double equationDown = Math.sqrt(equationDown1) * Math.sqrt(equationDown2);
                if (equationDown != 0) {
                    sum += equationUp / equationDown;
                }
            }
            count++;
        }

        return sum / count;
    }

}
