class Person3
{
    private String name;
    private int age;
    class T1details
    {
        void TD(String name)
        {
            System.out.println("The person name is" +name);
        }
        void TD2(int age)
        {
            System.out.println("Person age is" +age);
        }
    }
    void T2details()
    {
        T1details obj=new T1details();
        obj.TD("Chreestina");
        obj.TD2(22);
    }
}
public class StaticInnerExample2 {
    public static void main(String[] args) {
        Person3 obj2=new Person3();
        obj2.T2details();
    }
}

