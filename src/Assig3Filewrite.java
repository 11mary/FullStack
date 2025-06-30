import java.nio.file.Files;
import java.nio.file.Paths;

public class Assig3Filewrite {
    public static void main(String[] args) throws Exception{
        String a="Assig3File.txt";
        String content="ni ninthe nidutha kanninalle uthara, nan adhe hadutha innu swalpa hathira, Gamanava seleyuva gelayane ninna maathe bere,";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("Your favorite song inserted");
    }
}
