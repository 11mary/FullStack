import java.util.PriorityQueue;

public class ClsPrioInteger {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(11);
        pq.offer(17);
        pq.offer(22);
        pq.offer(5);
        pq.offer(15);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.contains(56));
        pq.add(45);
        System.out.println(pq);
        pq.remove(17);
        System.out.println(pq);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.size());
        pq.clear();
        System.out.println(pq);
    }
}
