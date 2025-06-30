class chatuser extends Thread
{
    String user; //veriables
    String[] message;

    chatuser(String user,String[] message) //constructor
    {
        this.user=user;
        this.message=message;
    }
    public void run() //method
    {
        for (String msg : message) {
            System.out.println(user + " : " + msg);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class MultiThread_2perinter {
    public static void main(String[] args) {
        String[] user1msg = {"hi", "How are you", "what are you doing"}; //passing msg through array
        String[] user2msg = {"hello", "I'm good", "Nothing"};

        Thread t1 = new chatuser("mary", user1msg);
        Thread t2 = new chatuser("christina", user2msg);

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
