import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\其他\\Learning\\大三\\上\\软件工程\\第二次作业\\测试文本\\orig.txt");

            if (file.exists() && file.isFile()) {
                InputStreamReader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String lineTxt = null;
                List<String> txtList = new ArrayList<>();
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    txtList.add(lineTxt);
                    System.out.println(lineTxt);
                }
                reader.close();
            }

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
