import java.util.LinkedList;
import java.util.List;

public class ClcVector {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Rolls_royce");
        list.add("2000000");
        list.add("Deisel");
        list.add("Dubai");
        System.out.println("Car name is"+" "+list);
        list.add(0," Range rover");
        System.out.println("purchased another one"+" "+list);
        list.set(1,"C_no-8765646545");
        System.out.println("car no"+" "+list);
        System.out.println("get method"+" "+list.get(1));
        System.out.println("contains"+" "+list.contains("Banglore"));
        System.out.println("Size is"+" "+list.size());
        System.out.println("Remove"+" "+list.remove(4));
        list.addFirst("frm dubai");
        System.out.println("from"+" "+list);
        list.addLast("Black");
        System.out.println("color is"+" "+list);
        list.removeFirst();
        System.out.println("Removed first"+" "+list);
        list.removeLast();
        System.out.println("Removed last"+" "+list);
        list.clear();
        System.out.println("Cleared"+" "+list);

    }
}
