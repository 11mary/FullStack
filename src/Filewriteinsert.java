
import java.nio.file.Files;
import java.nio.file.Paths;

public class Filewriteinsert {
    public static void main(String[] args) throws Exception{
        String a="FirstFile.txt";
        String content="Happy to see you";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("Inserted");
    }
}
