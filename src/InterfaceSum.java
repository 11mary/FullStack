abstract class Sum2
{
    abstract void add(int a,int b);
    abstract void sub(int a,int b);
}
interface Sum
{
    void add1(int a,int b);
    void sub2(int c,int d);
}
public class InterfaceSum {
    public static void main(String[] args) {

          Sum obj2=new Sum() {

              public void add1(int a, int b)
              {
                  System.out.println(a+b);
              }
              public void sub2(int c, int d)
              {
                 System.out.println(c-d);
              }
          };
        Sum2 obj=new Sum2()
      {
          void add(int a, int b)
          {
              System.out.println(a+b);
          }
          void sub(int a, int b)
          {
              System.out.println(a-b);
          }
      };
      obj.add(1,2);
      obj.sub(2,1);
      obj2.add1(49,9);
      obj2.sub2(30,40);

    }
}
