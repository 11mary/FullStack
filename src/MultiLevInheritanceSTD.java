class Fruits
{
    String Season;
    String From_place;

    Fruits(String s,String fp)
    {
        Season=s;
        From_place=fp;
    }
    void Fdetails()
    {
        System.out.println(Season+" "+From_place);
    }

}
class Apple extends Fruits
{
    String Season_time;
    Apple(String S,String fp,String st)
    {
        super(S,fp);
        Season_time=st;
    }
    void Adetails()
    {
        System.out.println(Season+" "+From_place+" "+Season_time);
    }
}
class Mango1 extends Fruits
{
    String name;
    Mango1(String s,String fp,String n)
    {
       super(s,fp);
       name=n;
    }
    void Mdetails()
    {
        System.out.println(Season+" "+From_place+" " +name);
    }
}
public class MultiLevInheritanceSTD {
    public static void main(String[] args) {
        Apple obj=new Apple("Winter","kashmir","12months");
        obj.Adetails();
        Mango1 obj2=new Mango1("summer","Karnataka","Mango");
        obj2.Mdetails();
    }
}
