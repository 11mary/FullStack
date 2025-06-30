import java.util.ArrayList;
import java.util.List;

public class CLCListInterface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Elements are:"+" "+list);
        list.add(1,70);
        System.out.println("Element added:"+" "+list);
        System.out.println("get index:" + " "+list.get(3));
        System.out.println("remove index:"+" "+list.remove(1));
        System.out.println("modify:"+" "+list.set(2,60));
        System.out.println("avaibility checking:"+" "+list.contains(100));
        System.out.println("size:"+" "+list.size());



    }
}
