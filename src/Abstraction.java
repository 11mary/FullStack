abstract class Car
{
   abstract void Cdetails();
}
class Car_name extends Car
{
    void Cdetails()
    {
        System.out.println(" Range Rover ");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car_name obj=new Car_name();
        obj.Cdetails();
    }
}
