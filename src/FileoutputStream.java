import java.io.FileOutputStream;

public class FileoutputStream {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("first.mp3"))
        {
            System.out.println("File successfully created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
