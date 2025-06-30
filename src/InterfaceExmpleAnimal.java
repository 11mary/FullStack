interface Animal3
{
    void dog(String name,String color,String breed);
    void cat(String name,String color);
}
class Animal4 implements Animal3
{
    public void dog(String name,String color,String breed)
    {
        System.out.println(name+" "+color+" "+" "+breed);
    }
    public void cat(String name,String color)
    {
        System.out.println(name+" "+color);
    }
}
public class InterfaceExmpleAnimal {
    public static void main(String[] args) {
        Animal4 obj=new Animal4();
        obj.dog("bubblu","White","Lab");
        obj.cat("Pinky","Black");
    }
}
