import java.util.LinkedList;
import java.util.Queue;

public class ClcQUEUEBasic {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Mary");
        queue.offer("Christina");
        queue.offer("Merlyn");
        System.out.println(queue);
        System.out.println(queue.peek()); //peek will fetch fst element in queue
        queue.poll(); //remove the fst elemt
        System.out.println(queue);
    }
}
