import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file=new File("First File.txt");
        if (file.exists())
        {
            if(file.delete())
            {
                System.out.println("file deleted");
            }
            else
            {
                System.out.println("file not available");
            }
        }
        else
        {
            System.out.println("file does not exist");
        }
    }
}
