import java.util.HashSet;
import java.util.Set;

public class ClcSetInt {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(6);
        set.add(1);
        set.add(2);
        set.add(11);
        set.add(32);
        set.add(3);
        set.add(4);
        set.add(7);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(67));


    }
}
