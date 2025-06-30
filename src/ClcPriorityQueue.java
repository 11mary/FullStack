import java.util.PriorityQueue;

public class ClcPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> PQ=new PriorityQueue<>();
        PQ.offer("Mary");
        PQ.offer("Christina");
        PQ.offer("Ladia");
        System.out.println(PQ);

        System.out.println(PQ.peek());
    }
}
