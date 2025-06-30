import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class Con implements Consumer<Integer> //class
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}*/
public class Java8FunctionInterface {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
            Consumer<Integer> obj=i-> System.out.println(i); //lamda function
         list.forEach(obj);


       /* Consumer<Integer> obj=new Consumer<Integer>  // anonymous class
         public void accept(Integer i)
    {
        System.out.println(i);
    }
    list.forEach(obj);
          */
    }
}
