 class Add {
    public void sum(int a,int b)
    {
        System.out.println("addition is " +(a+b));  //without return
    }
    public int sub(int a,int b)
    {
        return a-b;  //with return type
     }
}
public class Methods {
    public static void main(String[] args) {
        Add obj=new Add();
        obj.sum(3,1);
        int result=obj.sub(5,7);
        System.out.println("Substraction is " +result);

    }
}