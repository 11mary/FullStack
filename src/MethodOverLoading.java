class sum
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.add(20,30);
        obj.add(10,20,40);
    }
}
