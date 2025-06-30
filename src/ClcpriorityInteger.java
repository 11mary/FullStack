import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ClcpriorityInteger {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        Stack<String> stack=new Stack<>();
        queue.offer("M");
        queue.offer("A");
        queue.offer("R");
        queue.offer("y");
        System.out.println(queue);
       while (!queue.isEmpty())
        {
            stack.push(queue.poll());
           System.out.println(queue);
        }
        while (!stack.isEmpty())
        {
            queue.offer(stack.pop());
            System.out.println(queue);
        }
    }
}
