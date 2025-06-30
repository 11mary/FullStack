import java.util.Stack;

public class ClcStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(3);
        s.push(5);
        s.push(12);
        s.push(23);
        s.push(32);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains(34));
        s.pop();
        System.out.println(s);
        System.out.println("peek"+s.peek());
        s.add(32);
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
