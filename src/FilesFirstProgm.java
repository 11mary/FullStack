import java.io.File;

public class FilesFirstProgm {
    public static void main(String[] args) throws Exception{
        String a="Mary1.txt";
        File file=new File(a);
        if (file.createNewFile())
        {
            System.out.println("File created successufully");
        }else {
            System.out.println("try again");
        }
    }
}
