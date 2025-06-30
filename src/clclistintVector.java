import java.util.List;
import java.util.Vector;

public class clclistintVector {
    public static void main(String[] args) {
        List<String> LL=new Vector<>();
        LL.add("3");
        LL.add("0");
        LL.add("1");
        LL.add("9");
        LL.add("CS");
        System.out.println(LL);
        LL.add(0,"2");
        System.out.println(LL);
        LL.get(3);
        System.out.println(LL);
        LL.set(1,"2");
        System.out.println(LL);
        LL.remove(0);
        System.out.println(LL);
        LL.addFirst("22");
        System.out.println(LL);
        LL.addLast("029");
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();

        System.out.println(LL);
        LL.clear();
        System.out.println(LL);

    }
}
