import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Java8Map {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      /*  Function<Integer ,Integer> f=new Function<Integer ,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }

        };
        list.stream().filter(i-> i%2==0).map(f).forEach(System.out::println);

       */
        list.stream()
                .filter(i-> i%2==0)
                .map(i->i*2)
                .forEach(System.out::println);
    }
}
