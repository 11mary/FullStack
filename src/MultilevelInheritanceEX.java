class A1
{
    void demo()
    {
        System.out.println(" parent class");
    }
}
class B1
{
    void demo()
    {
        System.out.println(" child class");
    }
    void demo1()
    {
        System.out.println(" Extra child class");
    }
}
class C1
{
    void demo()
    {
        System.out.println(" child2 class");
    }
    void demo3()
    {
        System.out.println(" Extra222 child class");
    }
}
public class MultilevelInheritanceEX {
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.demo1();
        obj.demo();
        C1 obj2=new C1();
        obj2.demo();
        obj2.demo3();
    }
}
