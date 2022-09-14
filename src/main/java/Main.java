
import com.exception.FileException;
import com.utils.FileUtil;
import com.utils.CheckingUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileException {

        //file1为初始文件路径
        String file1 = args[0];
        //file2为抄袭文件路径
        String file2 = args[1];
        Map<String, List<Integer>> firstMap = CheckingUtil.getTxt(file1);
        Map<String, List<Integer>> secondMap = CheckingUtil.getTxt(file2);
        Double result = CheckingUtil.duplicationChecking(firstMap, secondMap);
        System.out.println(result);
        //args[2]为输出文件路径
        FileUtil.writeFile(args[2], String.valueOf(result));

    }

}
