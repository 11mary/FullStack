class CAR2
{
    String name;
    String type;

    CAR2(String na,String ty)
    {
        name=na;
        type=ty;
    }
    void Cdetails()
    {
        System.out.println(name+" "+type);
    }
}
class BMW extends CAR2
{
    String Mannual_Automation;
    BMW(String na,String ty,String man_Auto)
    {
        super(na,ty);
        Mannual_Automation=man_Auto;
    }
    void Bdetail()
    {
        System.out.println(name+" "+type+" "+Mannual_Automation);
    }
}
class  AUDI extends CAR2
{
    String price;
    AUDI(String na,String ty, String pr)
    {
        super(na,ty);
        price=pr;
    }
    void Adetail()
    {
        System.out.println(name+" "+type+" "+price);
    }
}
public class CarHierchicalInheritance {
    public static void main(String[] args) {
        BMW obj=new BMW("BMW","petrol","Manual");
        obj.Bdetail();
        AUDI obj2=new AUDI("Audi","Diesel","20000000");
        obj2.Adetail();
    }
}
