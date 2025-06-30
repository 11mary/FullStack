import java.util.HashSet;
import java.util.Set;

public class ClcSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Hi");
        set.add("Hello");
        set.add("HRU");
        set.add("Nice");
        System.out.println(set);
        set.remove("HRU");
        System.out.println(set);
    }
}
