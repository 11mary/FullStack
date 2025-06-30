class M implements Runnable
{
    public void run()
    {
        for (int i=0;i<3;i++)
        {
            System.out.println("Web developer");
            try {Thread.sleep(2000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class M2 implements Runnable
{
    public void run()
    {
        for (int i=0;i<3;i++)
        {
            System.out.println("Full stack developer");
            try {Thread.sleep(2000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class MultiThread_Interface {
    public static void main(String[] args) {
        Runnable obj1=new M();
        Runnable obj2=new M2();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
