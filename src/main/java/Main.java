
import com.utils.FileUtil;
import com.utils.IOUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        //file1为初始文件路径
        String file1 = args[0];
        //file2为抄袭文件路径
        String file2 = args[1];
        Map<String, List<Integer>> stringListMap = IOUtil.word(file1);
        Map<String, List<Integer>> stringListMap2 = IOUtil.word(file2);
        Double aDouble = IOUtil.count(stringListMap, stringListMap2);
        System.out.println(aDouble);
        //args[2]为输出文件路径
        FileUtil.writeFile(args[2], String.valueOf(aDouble));

    }

}
