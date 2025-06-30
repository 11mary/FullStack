interface Animal2
{
   void A_details();
}
class Elephant1 implements Animal2
{
    public void A_details()
    {
        System.out.println("First interface program");
    }

}
public class Interface {
    public static void main(String[] args) {
        Elephant1 obj=new Elephant1();
        obj.A_details();
    }
}
