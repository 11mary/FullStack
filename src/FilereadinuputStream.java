import java.io.FileInputStream;
import java.io.IOException;

public class FilereadinuputStream {
    public static void main(String[] args) {
        String a="image/pic.png";
        try(FileInputStream fis=new FileInputStream(a))
        {
            int character;
            while ((character=fis.read())!=-1)
            {
                System.out.println(character);
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
