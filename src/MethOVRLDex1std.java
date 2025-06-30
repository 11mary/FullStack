class Student4
{
    public void Sdetails( String name,String branch_name)
    {
        System.out.println(name+" "+branch_name);
    }
    public void Sdetails(String name,String branch_name,String address)
    {
        System.out.println(name+" "+branch_name+" "+address);

    }
}
public class MethOVRLDex1std {
    public static void main(String[] args) {
        Student4 obj=new Student4();
        obj.Sdetails("Mary P","Computer Science");
        obj.Sdetails("Pavi","Computer Science","Banglore");
    }
}
