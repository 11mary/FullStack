import java.util.ArrayList;
import java.util.List;

public class ClcArrayListStudentAssig {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Christina");
        list.add("2019CS029");
        list.add("8553702483");
        list.add("Banglore");
        System.out.println("Student details are"+" "+list);
        list.add(0,"Mary");
        System.out.println("Student First name added"+" "+list);
        list.set(1,"P");
        System.out.println("Student Last name added"+" "+list);
        System.out.println("get method"+" "+list.get(1));
        System.out.println("contains"+" "+list.contains("manglore"));
        System.out.println("Size is"+" "+list.size());
        System.out.println("Remove"+" "+list.remove(4));
        System.out.println("Student details are"+" "+list);
    }
}
