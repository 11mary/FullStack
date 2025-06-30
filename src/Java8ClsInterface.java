interface A10
{
    default void demo()
    {
        System.out.println("Demo1");
    }
}
interface B10
{
    default void demo()
    {
        System.out.println("Demo2");
    }
}
class C10
{
    public void demo()
    {
        System.out.println("Demo3");
    }
}
public class Java8ClsInterface extends C10 implements A10{
    public static void main(String[] args) {
        A10 obj=new Java8ClsInterface();
        obj.demo();
    }
}
