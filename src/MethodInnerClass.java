class outer4
{
    void Out()
    {
        class inner2
        {
            public void In()
            {
                System.out.println("Fisrt Method Inner class program");
            }
        }
        inner2 obj2=new inner2();
        obj2.In();
    }

}
public class MethodInnerClass {
    public static void main(String[] args) {
        outer4 obj1=new outer4();
        obj1.Out();
    }
}
