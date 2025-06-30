interface Vehicle
{
    void V_details(int V_vehicle_no,String V_Color);
    void VSound(String V_sound);
}
interface Car4 extends Vehicle
{
    void C_details(String C_name,String C_Color,double C_price);
    void CSound(String C_sound);
}
interface Bike extends Vehicle
{
    void B_details(String B_name,double B_price,int B_Engg_no);
    void BSound(String B_sound);
}
class mary1 implements Car4,Bike
{
    public void V_details(int V_vehicle_no,String V_Color)
    {
        System.out.println(V_vehicle_no+" "+V_Color);
    }
    public void VSound(String V_sound)
    {
        System.out.println(V_sound);
    }
    public void C_details(String C_name,String C_Color,double C_price)
    {
        System.out.println(C_name+" "+C_Color+" "+C_price);
    }
    public void CSound(String C_sound)
    {
        System.out.println(C_sound);
    }
    public void B_details(String B_name,double B_price,int B_Engg_no)
    {
        System.out.println(B_name+" "+B_price+" "+B_Engg_no);
    }
    public void BSound(String B_sound)
    {
        System.out.println(B_sound);
    }
}
public class VehiCarBikeExHiera {
    public static void main(String[] args) {
        mary1 obj=new mary1();
        obj.V_details(4,"white");
        obj.VSound("Loud");
        obj.C_details("RR","Black",10000000);
        obj.CSound("Low");
        obj.B_details("Royal ",200000,3);

    }
}
