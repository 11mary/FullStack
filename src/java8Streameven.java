import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class java8Streameven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       /* Predicate<Integer> p=new Predicate<Integer>()
        {
            public boolean test(Integer i) {
                return i%2==0;
            }
        }; */
       /* list.stream().filter(new Predicate<Integer>()
        {
            public boolean test(Integer i) {
                return i%2==0;
            }
        } */
        list.stream()
                .filter(i->i%2==0) //lamda
                .forEach(System.out::println);
    }
}
