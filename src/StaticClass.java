class outer1
{
    static class inner
    {
        void OT()
        {
            System.out.println("First static class program");
        }
    }
}
public class StaticClass {
    public static void main(String[] args) {
        outer1.inner obj=new outer1.inner();
        obj.OT();
    }
}
