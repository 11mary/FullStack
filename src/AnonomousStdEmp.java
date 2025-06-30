abstract class Sdeatils
{
    abstract void Student6(String Sname,String Sbranch);
}
abstract class Edetails3
{
    abstract void Employee6(String Ename,String role);
}
public class AnonomousStdEmp {
    public static void main(String[] args) {
        Sdeatils obj1=new Sdeatils()
        {
            void Student6(String Sname, String Sbranch)
            {
                System.out.println(Sname+" "+Sbranch);
            }
        };
        obj1.Student6("Mary","CS");
        Edetails3 obj2=new Edetails3()
        {
            void Employee6(String Ename,String role)
            {
                System.out.println(Ename+" "+role);
            }
        };
        obj2.Employee6("Pavi","Software developer");
    }
}
