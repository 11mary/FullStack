import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileCreWriReaDeelet {
    public static void main(String[] args) throws Exception {
        String a = "Panda.txt"; //file name 1
        String b = "Elephant.txt"; //file2 name 2
        String content = "I like elephants";
        File file = new File(a); // created file for panda
        if (file.createNewFile()) {
            System.out.println("file created");
        } else {
            System.out.println("try again");
        }
        File file2 = new File(b); //created file for elephant
        if (file2.createNewFile()) {
            System.out.println("Second file created");
        } else {
            System.out.println("try again for second file");
        }

        FileWriter writer = new FileWriter(a); //writing to panda file
        writer.write("I like Pandas");
        writer.close();

        Files.write(Paths.get(b), content.getBytes()); //writing to elephant file

        FileReader reader = new FileReader(a); //reading panda file
        reader.read();
        reader.close();

        try { //reading elephant file
            List<String> lin = Files.readAllLines(Paths.get(b));
            for (String line:lin)
            {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        File file3=new File(b); //deleting elephant file
        if (file3.exists())
        {
            if (file3.delete())
            {
                System.out.println("Elepant file deleted");
            }
            else{
                System.out.println("file not available");
            }
        }
        else {
            System.out.println("file does not exist");
        }

    }
}