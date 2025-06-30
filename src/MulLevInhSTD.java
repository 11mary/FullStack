class Animal
{
    String name;
    String color;

     Animal(String n,String c)
    {
        name=n;
        color=c;
    }
    void Ani_Details()
    {
        System.out.println(name+" "+color);
    }
}
class Elephant extends Animal
{
    String type;
    Elephant (String n,String c,String t)
    {
        super(n, c);
        type=t;
    }
    void Ani_Details2()
    {
        System.out.println(name+" "+color+" "+type);
    }
}
class baby_Elephant extends Elephant
{
    String Gender;
    baby_Elephant (String n,String c,String t,String G)
    {
        super(n, c, t);
        Gender=G;
    }
    void Ani_Details2()
    {
        System.out.println(name+" "+color+" "+type+" "+Gender);
    }
}
public class MulLevInhSTD {
    public static void main(String[] args) {
        baby_Elephant obj=new baby_Elephant("Bheema","Grey","Karnataka","Female");
        obj.Ani_Details2();

    }
}
