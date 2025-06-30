class Person2
{
    private String name="Mary P";
     class Pdetails3
    {
        public String getValue()
        {
            return name;
        }
    }
}
public class NestedInnerExample {
    public static void main(String[] args) {
        Person2 obj1=new Person2();
        Person2.Pdetails3 obj2=obj1.new Pdetails3();
        System.out.println("Person name is "+obj2.getValue());
    }
}
