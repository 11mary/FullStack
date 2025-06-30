import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ClcQueueStdpgm {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.add(10);
        queue.add(2);
        queue.add(13);
        queue.add(4);
        System.out.println("Queue elements"+" "+queue);
        while (!queue.isEmpty()) //if queue is not empty push the elements to stack
        {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) //if stack is not empty elements move to queue
        {
            queue.offer(stack.pop());
        }
        System.out.println("Reversed elements"+" "+queue);
    }
}
