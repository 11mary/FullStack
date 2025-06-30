abstract class A5
{
    abstract void show();
}
public class AnonomousInnerClass {
    public static void main(String[] args) {
        A5 obj=new A5()
        {
            void show()
            {
                System.out.println("First anonomous inner class");
            }
        };
        obj.show();
    }
}
