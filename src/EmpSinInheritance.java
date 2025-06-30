import java.util.Scanner;

class Employee2
{
    String name;
    String roll;
    double salary;

    Employee2(String n,String r,double s)
    {
        name=n;
        roll=r;
        salary=s;
    }
    void Employeedetails()
    {
        System.out.println("Employee name is"+name+" "+"Employee roll is"+roll+" "+"Employee salary is"+salary);
    }
    void Employee2()
    {
       Employeedetails();
    }
}
public class EmpSinInheritance {
    public static void main(String[] args) {
        Employee2 obj=new Employee2("mary","software developer",50000);
        obj.Employeedetails();

    }
}
