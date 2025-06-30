import java.util.PriorityQueue;

public class ClcPririotyorder {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("Mary");
        pq.offer("Christina");
        pq.offer("Peter");
        pq.offer("Nagaraj");
        pq.offer("Prakash");
        pq.offer("zuy");
        pq.offer("Ayu");
        System.out.println(pq);
       //System.out.println(pq.peek());
        while(!pq.isEmpty())
        {
            System.out.println( pq.poll());
        }
    }
}

