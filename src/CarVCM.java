class Vehical
{
    String car_name;
    int car_model;
    String car_color;
    double car_price;
    Vehical(String cn,int cm,String cc,double cp)
    {
        car_name=cn;
        car_model=cm;
        car_color=cc;
        car_price=cp;
    }
    public void Details()
    {
        System.out.println(car_name+""+car_model+ ""+car_color+""+car_price);

    }
}
public class CarVCM {
    public static void main(String[] args) {
       Vehical obj=new Vehical("Range Rover",2025,"Black",20000000);
       obj.Details();
        Vehical obj1=new Vehical("BMW",2023,"null",3000000);
        obj1.Details();



    }

}
