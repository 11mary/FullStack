class person
{
    private String name="Mary";
    private int age=22;

    public String getName()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
}
public class EncapsulnGetterMethod {
    public static void main(String[] args) {
        person obj=new person();
        System.out.println(" person name is" +obj.getName());
        System.out.println(" person age is" +obj.getage());
    }
}
