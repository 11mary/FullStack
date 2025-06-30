class Person6
{
    private String name="ledia";
    private int age=22;
    class Pdetails2
    {
        public String getname()
        {
            return name;
        }
        public int getage()
        {
            return age;
        }
    }
}
public class NestedInnerExample2 {
    public static void main(String[] args) {
        Person6 obj1=new Person6();
        Person6.Pdetails2 obj2=obj1.new Pdetails2();
        System.out.println(obj2.getname()+" "+obj2.getage());
    }
}
