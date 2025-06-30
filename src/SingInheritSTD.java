class Student2
{
    private int ID;
    public String name;

    Student2(int Id,String na)
    {
        ID = Id;
        name = na;
    }
    void displayDetails()
    {
        System.out.println("Student ID  is" +ID + " " + "Student name is" + name);
    }
        void access()
        {
        displayDetails();
        }

}
public class SingInheritSTD {
    public static void main(String[] args) {
        Student2 obj=new Student2(20,"Mary");
        obj.displayDetails();

    }
}
