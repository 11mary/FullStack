class Cricket
{
    void C_IPL()
    {
        class Finals_IPL
        {
            public void Person3(String name, int age )
            {
                System.out.println("Cricketer name is"+name+" "+"Cricketer age is"+age);
            }
            public void Dog(String name,String color)
            {
                System.out.println("Cricketer dog name is"+name+" "+"Cricketer dog color is"+color);
            }
        }
        Finals_IPL obj=new Finals_IPL();
        obj.Person3("Virat",30);
        obj.Dog("bubblu","white");
    }
}
public class MethodInnerPerson {
    public static void main(String[] args) {
        Cricket obj2=new Cricket();
        obj2.C_IPL();
    }
}
