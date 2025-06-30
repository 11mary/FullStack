import java.io.FileOutputStream;

public class Assig2FileCI2method {
    public static void main(String[] args) {
        String a="Assig2File.txt";
        String content="This is an assig2 which uses FileOutputStream";
        try {
            FileOutputStream fos=new FileOutputStream(a);
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("inserted");
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
