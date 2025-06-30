class Edetails
{
    private class Edetails2
    {
        void Employee1(String name)
        {
            System.out.println("Employee name is "+name);
        }
        void Employee2(int ID)
        {
            System.out.println("Employee ID is "+ID);
        }
        void Department1(String Dname)
        {
            System.out.println("Department name is "+Dname);
        }
        void Department2(String Role)
        {
            System.out.println("Role is "+Role);
        }
    }
    void Edetails2()
    {
        Edetails2 obj=new Edetails2();
        obj.Employee1("Mary");
        obj.Employee2(7);
        obj.Department1("Software");
        obj.Department2("Full stack developer");
    }
}
public class StaticInnerEmployee {
    public static void main(String[] args) {
        Edetails obj2=new Edetails();
        obj2.Edetails2();
    }
}
