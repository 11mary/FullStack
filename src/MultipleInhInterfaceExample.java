interface Dog3
{
    void D_details(String D_name,String D_breed,String D_color);

}
interface Cat3 extends Dog3
{
    void C_details(String C_name,String C_color);
}
class Cad implements Dog3,Cat3
{
    public void D_details(String D_name,String D_breed,String D_color)
    {
        System.out.println(D_name+" "+D_breed+" "+D_color);
    }
    public void C_details(String C_name,String C_color)
    {
        System.out.println(C_name+" "+C_color);
    }
}
public class MultipleInhInterfaceExample {
    public static void main(String[] args) {
        Cad obj=new Cad();
        obj.D_details("Bubblu","Lab","White");
        obj.C_details("pappu","Black");
    }
}
