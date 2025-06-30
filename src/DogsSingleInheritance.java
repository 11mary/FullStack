class Dogs
{
    String name;
    String colour;
    Dogs(String na,String co)
    {
        name=na;
        colour=co;
    }
    void Ddetails()
    {
        System.out.println("Dog name is"+name+" "+"Dog color is"+colour);
    }

}
class Baby_dogs extends Dogs
{
    int age;
    Baby_dogs(int a,String na,String co)
    {
        super(na, co);
        age=a;
    }
    void Bdetails()
    {
        System.out.println(name+" "+colour+" "+age);
    }
}
public class DogsSingleInheritance {
    public static void main(String[] args) {
        Baby_dogs obj=new Baby_dogs(1,"Bubblu","White");
        obj.Bdetails();
        Dogs obj2=new Dogs("muuuui","Black");
        obj2.Ddetails();
    }
}
