class Add4
{
  public static int addition(int a,int b)
   {
       return a+b;
   }
    public static int addition(int a,int b,int c)
    {
        return a+b+c;
    }

}
public class StaticOverloadingDY {
    public static void main(String[] args) {
    System.out.println(Add4.addition(3,4));
    System.out.println(Add4.addition(1,2,3));
    }
}
