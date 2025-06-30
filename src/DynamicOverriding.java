class animal
{
    void adetails()
    {
        System.out.println("I like animals ");
    }
}
class dog31 extends animal
{
    void ddetails()
    {
        System.out.println("I do like dogs");
    }
}
public class DynamicOverriding {
    public static void main(String[] args) {
        animal obj=new dog31();
          obj.adetails();
        dog31 obj1=new dog31();
         obj1.ddetails();
    }
}
