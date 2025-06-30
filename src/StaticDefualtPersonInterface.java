interface Pdetails
{
    static void person1(String p1name,String pcolor,int p_age)
    {
        System.out.println(p1name+" "+pcolor+" "+p_age);
    }
    default void person2(String p2name,String pqualification)
    {
        System.out.println(p2name+" "+pqualification);
    }
}
class Mary1 implements Pdetails
{
    @Override
    public void person2(String p2name,String pqualification)
    {
        System.out.println(p2name+" "+pqualification);
    }
}
public class StaticDefualtPersonInterface{
    public static void main(String[] args) {
        Pdetails.person1("Chreestina","fair",22);
        Mary1 obj=new Mary1();
        obj.person2("Ledia","BE");
    }
}
