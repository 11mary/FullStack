class Promodifier{
    int a=1;
    protected void promod()
        {
        System.out.println("First Protected program" +a);
    }
}
public class ProtectedModifier {
    public static void main(String[] args) {
        Promodifier obj=new Promodifier();
        obj.promod();
    }
}
