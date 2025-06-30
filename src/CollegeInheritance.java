//multilevel inheritance
class College
{
    String Cname;
    String Caddress;

    College(String cn,String ca)
    {
        Cname=cn;
        Caddress=ca;
    }
    void Cdetails()
    {
        System.out.println(Cname+" "+Caddress);
    }
}
class Deptartment extends College
{
    String dname;
    String tname;
    Deptartment(String dn,String ca,String ta,String cn)
    {
        super(ca,cn);
        dname=dn;
        tname=ta;
    }
    void ddetails()
    {
        System.out.println(dname+" "+Caddress+" "+tname+" "+Cname);
    }
}
class Student3 extends Deptartment
{
    String student_name;
    String roll_no;

    Student3(String cn, String ca, String dn, String ta, String sn, String rn) {
        super(cn, ca, dn, ta);  // Pass to Department constructor
        student_name = sn;
        roll_no = rn;
    }

    void Sdetails2()
    {
        System.out.println(student_name + " " + tname + " " + roll_no+" "+Cname+" "+Caddress+" "+dname+" "+student_name);
    }
}
public class CollegeInheritance {
    public static void main(String[] args) {
        Deptartment obj=new Deptartment("CS","Banglore","Manjunath sir","Tata Strive");
        obj.ddetails();
        Student3 obj2=new Student3("Tata Strive"," Banglore","CS","Manjunath sir","Mary","7");
        obj2.Sdetails2();
    }
}
