import java.io.File;
import java.io.FileWriter;

class FileWriterExample {
    public static void main(String[] args) throws Exception {
        String a = "Mary.txt";
        File file = new File(a);

        FileWriter writer = new FileWriter(file);
        writer.write("hi mary");
        writer.write("How are you");
        writer.close();

        System.out.println("File created and written successfully.");
    }
}
