interface A2
{
    void add();
}
interface B2
{
    void sub();
}
class C2 implements A2,B2
{
    public void add()
    {
        System.out.println("Parent 1");
    }
    public void sub()
    {
        System.out.println("Parent 2");
    }
}
public class MultipleInheritInterface {
    public static void main(String[] args) {
        C2 obj=new C2();
        obj.add();
        obj.sub();
    }
}
