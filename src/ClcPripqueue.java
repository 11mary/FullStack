import java.util.PriorityQueue;

public class ClcPripqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> Pq=new PriorityQueue<>();
        Pq.offer(2);
        Pq.offer(7);
        Pq.offer(17);
        Pq.offer(11);
        System.out.println(Pq);
        System.out.println(Pq.peek());
    }
}
