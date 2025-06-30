class Outer
{
    private int a=7;
    class Inner
    {
        public int getNum()
        {
            return a;
        }
    }
}
public class Nestedinner {
    public static void main(String[] args) {
        Outer obj1=new Outer();
        Outer.Inner obj2=obj1.new Inner();
        System.out.println(obj2.getNum());
    }
}
