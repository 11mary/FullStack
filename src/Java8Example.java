import java.util.Scanner;

interface A12
{
    void add1(int a,int b);

    //void mul(int a,int b);
}
interface B12
{
    void sub1(int a,int b);
}
interface C12
{
    void mul(int a,int b);
}
/*class B12 implements A12
{

    public void add1(int a, int b) {
        System.out.println(a+b);
    }

    public void sub1(int a, int b) {
        System.out.println(a-b);
    }


    public void mul(int a, int b) {
        System.out.println(a*b);
    }
} */
public class Java8Example {
    public static void main(String[] args) {
      /*  B12 obj=new B12();
        obj.add1(24,5);
        obj.sub1(8,7);
        obj.mul(2,56); */

      /*  A12 obj=new A12() {

            public void add1(int a, int b)
            {
                System.out.println(a+b);
            }
            public void sub1(int a, int b)
            {
                System.out.println(a-b);
            }
            public void mul(int a, int b)
            {
                System.out.println(a*b);
            }
        };
        obj.add1(2,4);
        obj.sub1(23,12);
        obj.mul(3,45);  */

        A12 obj=(a,b)-> System.out.println(a+b);
        obj.add1(1,3);
        B12 obj2=(a,b)-> System.out.println(a-b);
        obj2.sub1(2,3);
        C12 obj3=(a,b)-> System.out.println(a*b);
        obj3.mul(4,3);



    }
}
