class Employee3
{
    private String E_name="Mary";
    private int E_id=7;
    private double E_salary=50000;

    public String getE_name()
    {
        return E_name;
    }
    public int getE_id()
    {
        return E_id;
    }

    public double getE_salary()
    {
        return E_salary;
    }
    void setE_name(String E_name1)
    {
        E_name=E_name1;
    }
    void setE_id(int E_id1)
    {
        E_id=E_id1;
    }
    void setE_salary(double E_salary1)
    {
        E_salary=E_salary1;
    }
}
public class EmployeeExRW {
    public static void main(String[] args) {
        Employee3 obj=new Employee3();
        obj.setE_name("Pavithra");
        obj.setE_id(77);
        obj.setE_salary(60000);
        System.out.println("Employee name is " +" "+obj.getE_name());
        System.out.println("Employee id is"+" "+obj.getE_id());
        System.out.println("Employee salary is"+" "+obj.getE_salary());
    }
}
