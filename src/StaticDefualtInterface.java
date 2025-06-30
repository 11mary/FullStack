interface A4
{
    static void show()
    {
        System.out.println(" Static method");
    }
    default void display()
    {
        System.out.println(" Deafult method");
    }
}
class demo implements A4
{
    public void display()
    {
        System.out.println(" Deafult method");
    }
}
public class StaticDefualtInterface {
    public static void main(String[] args) {
        A4.show();
        demo obj=new demo();
        obj.display();
    }
}
