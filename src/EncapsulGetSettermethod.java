class person1
{
    private String name="mary";
    private int age=22;
    public String getName()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public void setName(String name1)
    {
        name = name1;
    }
    public void setAge(int age1)
    {
        age=age1;
    }
}
public class EncapsulGetSettermethod {
    public static void main(String[] args) {
        person1 obj=new person1();
        obj.setName("Prabhu");
        obj.setAge(29);
        System.out.println(" person name is" +obj.getName());
        System.out.println(" person age is" +obj.getage());
    }
}
