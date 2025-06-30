class M3 implements Runnable
{
    public void run()
    {
        for (int i=10;i<=50;i+=10)
        {
            System.out.println(i+"%");
            try {Thread.sleep(1000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("water is filling");
        }
        System.out.println("water is filled");

    }
}

public class MultiThreadWaterfilling {
    public static void main(String[] args) {
        Runnable obj=new M3();
        Thread t=new Thread(obj);
        t.start();

    }
}
