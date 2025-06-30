import static java.awt.Color.red;

class Signal implements Runnable
{
    public void run()
    {
       for (int i=0;i<2;i++)
        {
           System.out.println("Red : Stop");
           try {
               Thread.sleep(1000);
           }catch (Exception e)
           {
               System.out.println(e);
           }
           System.out.println("Yellow : Ready");
           try {
               Thread.sleep(1000);
           }catch (Exception e)
           {
               System.out.println(e);
           }
           System.out.println("Green : Go");
           try {
               Thread.sleep(1000);
           }catch (Exception e)
           {
               System.out.println(e);
           }
       }
    }
}
public class MultithreadASSIGsignal {
    public static void main(String[] args) {
       Runnable obj=new Signal();

       Thread t1=new Thread(obj);
       t1.start();
    }
}
