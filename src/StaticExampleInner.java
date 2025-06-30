class Person4
{
    private String name;
    class Pdetails1
    {
        void PD(String name)
        {
            System.out.println(name);
        }
    }
    void Pdetails1()
    {
        Pdetails1 obj=new Pdetails1();
        obj.PD("Manjunath Sir");
    }
}
public class StaticExampleInner {
    public static void main(String[] args) {
        Person4 obj2=new Person4();
        obj2.Pdetails1();
    }
}
