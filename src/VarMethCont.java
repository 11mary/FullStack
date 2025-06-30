class Bird
{
    String name;
    String color;        //variable declaration
    Bird(String n,String c)
    {
        name=n;
        color=c;    // construction (Assigning the value)
    }
    public void Details() //methods
    {
        System.out.println("The bird name and color is" +(name+color));
    }

}
public class VarMethCont {
    public static void main(String[] args) {
        Bird obj=new Bird("Sparrow","grey");
        obj.Details();
    }
}
