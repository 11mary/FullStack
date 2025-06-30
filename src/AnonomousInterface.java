interface Sum10
{
 void abcc(int a,int b);
}
public class AnonomousInterface {
    public static void main(String[] args) {
       Sum10 obj=new Sum10()
       {
           public void abcc(int a, int b)
           {
               System.out.println(a+b);
           }
       };
       obj.abcc(1,4);
    }
}
