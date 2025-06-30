class LearnerTutor extends Thread {
    String user;
    String[] message;

    LearnerTutor(String user, String[] message) {
        this.user = user;
        this.message = message;
    }

    public void run() {
        for (String msg : message) {
            System.out.println(user + ":" + " " + msg );
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreadingASSIG {
    public static void main(String[] args) {
        String[] user1msg={"Hi sir","I need a help sir","I'm stuck in arrays","In logical thinking","Thank you sir"};
        String[] user2msg={"Hello mary","Yes,please let me know","Where in arrays","yeh okay got it let me help you in that","Welcone"};

        Thread obj=new LearnerTutor("mary",user1msg);
        Thread obj1=new LearnerTutor("manjunath sir",user2msg);

        obj.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        obj1.start();
    }
}
