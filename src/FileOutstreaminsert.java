import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutstreaminsert {
    public static void main(String[] args) {
        String a="Mary1.txt";
        String content="Hi,how are you";
        try(FileOutputStream fos=new FileOutputStream(a))
        {
          byte[] bytes=content.getBytes();
          fos.write(bytes);
          System.out.println("inserted");
          fos.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
