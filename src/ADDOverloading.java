class Addistion
{
    public void Sum(float m,float c)
    {
        System.out.println("Addition of two number is " + " "+ (m+c));
    }
    public  void Sum(float m,float c,float s)
    {
        System.out.println("Addition of three  number is"+" "+(m+c+s));
    }
}
public class ADDOverloading {
    public static void main(String[] args) {
        Addistion obj=new Addistion();
        obj.Sum(10,20);
        obj.Sum(3,4,6);
    }
}
