import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class java8ReduceAdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      /*  BinaryOperator<Integer> b=new BinaryOperator<Integer>() {

            public Integer apply(Integer i, Integer j) {
                return i+j;
            }
        };
      Integer sum =list.stream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .reduce(0,b);
      System.out.println(sum);


       */
        Integer sum = list.stream().filter(i -> i % 2 == 0).map(i -> i * 2).reduce(0, (i, j) -> i + j);
        System.out.println(sum);
    }
}