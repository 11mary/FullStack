import java.io.File;
import java.io.FileWriter;

public class Assig1FileCi {
    public static void main(String[] args) throws Exception{
        String a="FileAssig.txt";
        File file=new File(a);
        if (file.createNewFile())
        {
            System.out.println("File created successfully");
        }else {
            System.out.println("try again");
        }
        FileWriter writer=new FileWriter(file);
        writer.write("Hi,Christina" );
        writer.write("I hope your doing well" );
        System.out.println("And Inserted successfully");
        writer.close();
    }
}
