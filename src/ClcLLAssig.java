import java.util.LinkedList;
import java.util.List;

public class ClcLLAssig {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("University");
        list.add("Dept");
        list.add("CS");
        list.add("Banglore");
        System.out.println("Coolege name is"+" "+list);
        list.add(0,"Christ");
        System.out.println("College Full name is"+" "+list);
        list.set(1,"C_no-8765646545");
        System.out.println("college no"+" "+list);
        System.out.println("get method"+" "+list.get(1));
        System.out.println("contains"+" "+list.contains("Banglore"));
        System.out.println("Size is"+" "+list.size());
        System.out.println("Remove"+" "+list.remove(4));
        list.addFirst("branch-yashwantpur");
        System.out.println("brach is"+" "+list);
        list.addLast("formals");
        System.out.println("Dress code added"+" "+list);
        list.removeFirst();
        System.out.println("Removed first"+" "+list);
        list.removeLast();
        System.out.println("Removed last"+" "+list);
        list.clear();
        System.out.println("Cleared"+" "+list);

    }
}
