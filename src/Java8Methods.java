import java.util.Arrays;
import java.util.List;

public class Java8Methods {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,345,54,67,21,68,1,3,1);
       // list.stream().sorted().forEach(System.out::println);
        //list.stream().distinct().forEach(System.out::println);
        //list.stream().skip(4).forEach(System.out::println);
       // list.stream().limit(4).forEach(System.out::println);
        long l=list.stream().count();
        System.out.println(l);


    }
}
