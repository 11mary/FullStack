class Student5
{
    private String S_name = "Mary";
    private String S_branch = "CS";
    private int S_roll_no = 7;
    private String S_address = "Banglore";

    public String getName()
    {
        return S_name;
    }
    public String getBranch()
    {
        return S_branch;
    }
    public int getroll_no()
    {
        return S_roll_no;
    }
    public String getaddress()
    {
        return S_address;
    }
    public void setName(String S_name1)
    {
        S_name = S_name1;
    }
    public void setbranch(String S_branch1)
    {
       S_branch=S_branch1;
    }
    public void setroll_no(int S_roll_no1)
    {
        S_roll_no=S_roll_no1;
    }
    public void setaddress(String S_address1)
    {
        S_address=S_address1;
    }
}
public class StudentGetterSetter {
    public static void main(String[] args) {
        Student5 obj=new Student5();
        obj.setName("Prabhu");
        obj.setbranch("IT engineer");
        obj.setroll_no(4);
        obj.setaddress("Banglore north");
        System.out.println(obj.getName()+" "+obj.getBranch()+" "+ obj.getroll_no()+" "+obj.getaddress());
    }
}
