import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadAlldata {
    public static void main(String[] args) {
        String a="Mary.txt";
        try {
            List<String> lines= Files.readAllLines(Paths.get(a));

            for(String line:lines)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
