class A7 extends Thread
{
    public void run()
    {
        System.out.println("Red signal");
        try {Thread.sleep(2000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class B7 extends Thread
{
    public void run()
    {
        System.out.println("Yellow signal");
        try {Thread.sleep(2000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class C7 extends Thread
{
    public void run()
    {
        System.out.println("green signal");
        try {Thread.sleep(2000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class MultiThreadingSignal {
    public static void main(String[] args) {
          Thread obj1=new A7();
          Thread obj2=new B7();
          Thread obj3=new C7();
          obj1.start();
          obj2.start();
          obj3.start();
    }
}
