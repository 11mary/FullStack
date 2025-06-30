class A6 extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Front end developer");
            try {Thread.sleep(2000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class B6 extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Back end developer");
            try {Thread.sleep(2000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Thread obj1=new A6();
        Thread obj2=new B6();
        obj1.start();
        obj2.start();
    }
}
