import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWrite {
    public static void main(String[] args) {
        String a="Java.txt";
        try
        {
            Files.write(Paths.get(a),"Hello".getBytes());
            System.out.println("File created");
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
