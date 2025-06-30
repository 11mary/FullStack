import java.util.ArrayList;
import java.util.List;

public class Java8ForEach {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(11);
        list.add(18);
        list.add(67);

        list.forEach(i -> System.out.println(i)); //foreach method
    }
}
