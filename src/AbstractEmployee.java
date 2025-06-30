abstract class Company {
    abstract void Employee(String name, int E_Id, double salary);

    abstract void Department(String D_name, int D_Id);


    void Employee4(String name, int E_Id, double salary)
    {
        System.out.println(name + " " + E_Id + " " + salary);
    }
}
class Department extends Company {
    void Employee(String name, int E_Id, double salary) {
        System.out.println(name+" "+E_Id+" "+salary);
    }

    void Department(String D_name, int D_Id) {
        System.out.println(D_name + " " + D_Id);
    }

    void Employee4(String name, int E_Id, double salary) {
        System.out.println(name + " " + E_Id + " " + salary);
    }
}
public class AbstractEmployee {
    public static void main(String[] args) {
        Department obj=new Department();
        obj.Employee("Mary P",20,50000);
        obj.Department("Full Stack developer",2);
        obj.Employee4("Pavi",19,30000);
    }
}
