import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamAPI {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
              // Stream<Integer> s1=list.stream();
           //    s1.filter(p->p%2==0);
               System.out.println(list);
               Stream s1=list.stream();
               s1.forEach(System.out::println);
    }
}
