interface A8
{
    default void demo()
    {
        System.out.println("Hi");
    }
}
class demo1 implements A8
{

}
public class Java8Def {
    public static void main(String[] args) {
        A8 obj=new demo1();
        obj.demo();
    }
}
