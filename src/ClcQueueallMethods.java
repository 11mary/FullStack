import java.util.LinkedList;
import java.util.Queue;

public class ClcQueueallMethods {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.peek()); //access fst element
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.contains(9));
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);

    }
}
