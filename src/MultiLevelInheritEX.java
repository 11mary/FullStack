class A
{
    void Red()
    {
        System.out.println("Red color");
    }
}
class B extends A
{
    void Black()
    {
        System.out.println("Black color");
    }
    void White()
    {
        System.out.println("White color");
    }
}
class C extends B
{
    void Orange()
    {
        System.out.println("orange color");
    }
    void Green()
    {
        System.out.println("Green color");
    }
    void purple()
    {
        System.out.println("Purple color");
    }
}
public class MultiLevelInheritEX {
    public static void main(String[] args) {
        C obj=new C();
        obj.Green();
        obj.Orange();
        obj.purple();
    }
}
