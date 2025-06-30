import java.util.Set;
import java.util.TreeSet;

public class Clcsettreeset {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(8);
        set.add(5);
        set.add(5); //duplication ignore
        set.add(3);
        set.add(7);
        set.add(9);
        set.add(11); //orderd
        System.out.println(set);
        set.remove(5);
        System.out.println(set);
        System.out.println(set.size());
    }
}
