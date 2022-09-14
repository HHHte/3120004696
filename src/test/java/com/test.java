package com;

import com.utils.FileUtil;
import com.utils.IOUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class test {

    @Test
    public void sameTest() throws IOException {
        String file1 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        String file2 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\1.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void addTest() throws IOException {
        String file1 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        String file2 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\1.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void delTest() throws IOException {
        String file1 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        String file2 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig_0.8_del.txt";
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\1.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void dis1Test() throws IOException {
        String file1 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        String file2 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\1.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void dis10Test() throws IOException {
        String file1 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        String file2 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\1.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void dis15Test() throws IOException {
        String file1 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt";
        String file2 = "D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\1.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
}
