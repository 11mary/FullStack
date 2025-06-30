class Criketer2
{
    private String name="Virat";
    private int age=30;
    private int no_of_match=200;
    class Cricketer3
    {
        void Cdetails()
        {
            System.out.println(name+" "+age+" "+" "+no_of_match);
        }
    }
}
public class Assignonstaticinnerclass {
    public static void main(String[] args) {
        Criketer2 obj1=new Criketer2();
        Criketer2.Cricketer3 obj2=obj1.new Cricketer3();
        obj2.Cdetails();

    }
}
