class kittens
{
    void Kittu()
    {
        class Kittens2
        {
            void Kitdeatils(String name,String color)
            {
                System.out.println(name+" "+color);
            }
            void k2(String name1)
            {
                System.out.println(name1);
            }
        }
        Kittens2 obj2=new Kittens2();
        obj2.Kitdeatils("kitty","white");
        obj2.k2("bubblu");
    }
}
public class Assignlocalinner {
    public static void main(String[] args) {
     kittens obj1=new kittens();
     obj1.Kittu();
    }
}
