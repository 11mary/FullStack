abstract class Animal6
{
    abstract void DOG(String name,String color);
    abstract void CAT(String name,String color);
}
public class AnonomousInnerClassDC {
    public static void main(String[] args) {
        Animal6 obj1=new Animal6()
        {
            void DOG(String name, String color)
            {
               System.out.println("Dog name is"+name+" "+"Dog color is"+color);
            }
            void CAT(String name, String color)
            {
                System.out.println("Cat name is"+name+" "+"Cat color is"+color);
            }
        };
        obj1.DOG("Bubblu","white");
        obj1.CAT("Pinku","black");
    }
}
