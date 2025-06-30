class outer
{
    private class inner
    {
        void demo()
        {
            System.out.println("My first inner class program");
        }
    }
    void display()
    {
        inner obj2=new inner();
        obj2.demo();
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        outer obj=new outer();
        obj.display();
    }
}
