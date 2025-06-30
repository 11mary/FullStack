import java.util.LinkedList;
import java.util.Queue;

public class Clcqueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queue1=new LinkedList<>();
        queue.offer("M");
        queue.offer("A");
        queue.offer("R");
        queue.offer("Y");
       // queue.offer("M a r y");
        System.out.println(queue);

        int size= queue.size();
        for (int i=0;i<size;i++)
        {
            int n= queue.size();
           for (int j=0;j< n-1;j++)
           {
               queue.offer(queue.poll());
           }
           queue1.offer(queue.poll());
        }
       /* while (!queue1.isEmpty())
        {
           queue.offer(queue1.poll());
        }
        System.out.println(queue);

        */
        System.out.println(queue1);
    }
}
