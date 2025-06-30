import java.util.ArrayDeque;

public class ClcArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        aq.addFirst(1);
        aq.addLast(2);
        aq.addLast(4);
        aq.addLast(5);
        aq.addLast(23);
        aq.addLast(45);
        System.out.println(aq);
        aq.removeFirst();
        System.out.println(aq);
        aq.removeLast();
        System.out.println(aq);

        System.out.println(aq.contains(67));
        System.out.println(aq.size());
        System.out.println(aq.getFirst());
        System.out.println(aq.getLast());
    }
}
