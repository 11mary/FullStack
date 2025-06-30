import java.util.ArrayList;
import java.util.List;

public class clclistinterfaceLL {
    public static void main(String[] args) {
        List<String> LL=new ArrayList<>();
        LL.add("Mary");
        LL.add("christina");
        LL.add("John");
        LL.add("Peter");
        System.out.println(LL);
        LL.get(2);
        System.out.println(LL);
        LL.size();
        System.out.println(LL);
        LL.set(2,"David");
        System.out.println(LL);
        LL.contains("Pavi");
        System.out.println(LL);
        LL.addFirst("Merlyn");
        System.out.println(LL);
        LL.addLast("Sherlyn");
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.clear();
        System.out.println(LL);
    }
}
