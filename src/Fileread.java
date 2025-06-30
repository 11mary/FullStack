import java.io.FileReader;
import java.io.IOException;

public class Fileread {
    public static void main(String[] args) {
        String a="Mary.txt";
        try(FileReader reader=new FileReader(a))
        {
            int Character;
            while((Character=reader.read())!=-1)
            {
                System.out.println((char)Character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
