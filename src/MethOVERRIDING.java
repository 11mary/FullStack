class A3
{
    public void mobile()
    {
        System.out.println("Nokia");
    }
}
class B3 extends A3
{
    public void mobile()
    {
        System.out.println("One plus");
    }
}
public class MethOVERRIDING {
    public static void main(String[] args) {
        B3 obj=new B3();
        obj.mobile();
    }
}
