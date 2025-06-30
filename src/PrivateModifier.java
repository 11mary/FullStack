class pmodifier
{
    int a=10;
    String name="Mary"; //veriable

    void info() //methods
    {
        System.out.println(a+name);
    }
    void access()
    {
        info();
    }
}
public class PrivateModifier {
    public static void main(String[] args) {
        pmodifier obj=new pmodifier();
        obj.info();
    }
}
