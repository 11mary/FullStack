interface I1
{
    void Vehicle(String Vname,String Vcolor);
    void Vsound(String Vsound);
}
interface I2 extends I1
{
    void Car(String cname,double Cprice,String Ccolor);
    void Csound(String Csound);
}
interface I3 extends I2
{
    void Bike(String bname,double bprice,int bengg_No);
    void Bsound(String Bsound);
}
class Mary implements I2,I3
{
    public void Vehicle(String Vname,String Vcolor)
    {
        System.out.println(Vname+ " "+Vcolor);
    }
    public void Vsound(String Vsound)
    {
        System.out.println( Vsound);
    }
    public void Car(String cname,double Cprice,String Ccolor)
    {
        System.out.println(cname+" "+Cprice+" "+ Ccolor);
    }
    public void Csound(String Csound)
    {
        System.out.println( Csound);
    }
    public void Bike(String bname,double bprice,int bengg_No)
    {
        System.out.println(bname+" "+bprice+" "+bengg_No);
    }
    public void Bsound(String Bsound)
    {
        System.out.println( Bsound);
    }
}
public class MultileveLInterface {
    public static void main(String[] args) {
        Mary obj=new Mary();
        obj.Vehicle("Tempo","Black");
        obj.Vsound("zuyyyyeeee");
        obj.Car("TATA SAFARI",20000000,"White");
        obj.Csound("zuuuuuuuuu");
        obj.Bike("Royal Enfield",3000000,7);
    }
}
