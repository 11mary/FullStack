class employee1{
    String Emp_name="mary";
    int Emp_id=25;
    Double emp_salary=25000.0;
}
class dept{
    int dept_id=1;
    String dept_name="SD";
}


public class EmpClsObj {
    public static void main(String[] args) {
        employee1 ob=new employee1();
        dept d=new dept();
        System.out.println("Employee name is" +ob.Emp_name);
        System.out.println("Employee ID is" +ob.Emp_id);
        System.out.println("Employee salary is" +ob.emp_salary);
        System.out.println("Dept ID is" +d.dept_id);
        System.out.println("Dept name is" +d.dept_name);


    }
}
