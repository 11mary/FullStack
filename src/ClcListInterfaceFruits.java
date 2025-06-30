import java.util.ArrayList;
import java.util.List;

public class ClcListInterfaceFruits {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("grapes");
        list.add("water melon");
        System.out.println("Fruits are"+" "+list);
       list.add(2,"kivi");
       System.out.println("fruit added"+list);
        System.out.println("fruit index:" + " "+list.get(3));
        System.out.println("removed fruit:"+" "+list.remove(1));
        System.out.println("modified fruit:"+" "+list.set(2,"mango2"));
        System.out.println("avaibility checking:"+" "+list.contains("pineapple"));
        System.out.println("size:"+" "+list.size());

    }
}
