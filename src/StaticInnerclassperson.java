class Person5
{
    private class Pdetails
    {
        void PD(String name)
        {
            System.out.println(name);
        }
        void PD2(int age)
        {
            System.out.println(age);
        }
    }
    void Display_PD()
    {
        Pdetails obj=new Pdetails();
        obj.PD("Mary");
        obj.PD2(22);

    }
}
public class StaticInnerclassperson {
    public static void main(String[] args) {
        Person5 obj2=new Person5();
        obj2.Display_PD();
    }
}
