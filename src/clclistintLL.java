import java.util.LinkedList;
import java.util.List;

public class clclistintLL {
    public static void main(String[] args) {
        List<Integer> LL=new LinkedList<>();
        LL.add(5);
        LL.add(5);
        LL.add(2);
        LL.add(0);
        LL.add(4,7);
        System.out.println(LL);
        LL.get(3);
        System.out.println(LL);
        LL.set(2,3);
        System.out.println(LL);
        LL.remove(4);
        System.out.println(LL);
        LL.addFirst(8);
        System.out.println(LL);
        LL.addLast(7);
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.clear();
        System.out.println(LL);




    }
}
