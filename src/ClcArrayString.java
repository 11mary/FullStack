import java.util.ArrayDeque;

public class ClcArrayString {
    public static void main(String[] args) {
        ArrayDeque<String> aq=new ArrayDeque<>();
        aq.add("Mary");
        aq.offer("Christina");
        System.out.println(aq);
        aq.addFirst("Ledia");
        aq.addFirst("Peter");
        System.out.println(aq);
        aq.addLast("John");
        System.out.println(aq);
        System.out.println(aq.size());
        System.out.println(aq.contains("Hi"));
        System.out.println("pop"+aq.pop());
        System.out.println(aq);
        System.out.println("peek in aq"+aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());
        System.out.println(aq.getFirst());
        System.out.println(aq.getLast());
        System.out.println(aq.remove());
        aq.offerFirst("vh");
        System.out.println(aq);
        aq.offerLast("see u");
        System.out.println(aq);
        aq.removeFirst();
        System.out.println(aq);
        aq.removeLast();
        System.out.println(aq);
        System.out.println("pop in"+aq.pop());
        System.out.println(aq);
        System.out.println("poll"+aq.poll());

        System.out.println(aq);
        aq.clear();
        System.out.println(aq);

    }
}
