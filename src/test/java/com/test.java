package com;

import com.exception.FileException;
import com.utils.FileUtil;
import com.utils.CheckingUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class test {

    @Test
    public void sameTest() throws FileException {
        String file1 = "D:\\测试文本\\orig.txt";
        String file2 = "D:\\测试文本\\orig.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void addTest() throws FileException {
        String file1 = "D:\\测试文本\\orig.txt";
        String file2 = "D:\\测试文本\\orig_0.8_add.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void delTest() throws FileException {
        String file1 = "D:\\测试文本\\orig.txt";
        String file2 = "D:\\测试文本\\orig_0.8_del.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void dis1Test() throws FileException {
        String file1 = "D:\\测试文本\\orig.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void dis10Test() throws FileException {
        String file1 = "D:\\测试文本\\orig.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void dis15Test() throws FileException {
        String file1 = "D:\\测试文本\\orig.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void addAndDelTest() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_add.txt";
        String file2 = "D:\\测试文本\\orig_0.8_del.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void addAndDis1Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_add.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void addAndDis10Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_add.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void addAndDis15Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_add.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void delAndDis1Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_del.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void delAndDis10Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_del.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void delAndDis15Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_del.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void dis1AndDis10Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_dis_1.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void dis1AndDis15Test() throws Exception {
        String file1 = "D:\\测试文本\\orig_0.8_dis_1.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

    @Test
    public void dis10AndDis15Test() throws FileException {
        String file1 = "D:\\测试文本\\orig_0.8_dis_10.txt";
        String file2 = "D:\\测试文本\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        FileUtil.writeFile("D:\\测试文本\\1.txt", String.valueOf(result));
        System.out.println(result);
    }

}
