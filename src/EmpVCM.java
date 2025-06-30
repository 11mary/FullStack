class Employee
{
    String e_name;
    String e_role;
    double e_salary;
    Employee(String en,String er,double es)
    {
        e_name=en;
        e_role=er;
        e_salary=es;
    }
     public void Details()
     {
        System.out.println(e_name+""+e_role+""+e_salary);
    }
}

public class EmpVCM {
    public static void main(String[] args) {
        Employee obj=new Employee("Mary","Software developer",500000);
        obj.Details();
    }
}
