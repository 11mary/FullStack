import java.util.LinkedHashSet;
import java.util.Set;

public class ClcSetexample {
    public static void main(String[] args) {
        Set<String> animal=new LinkedHashSet<>();
        animal.add("Panda");
        animal.add("Tiger");
        animal.add("Elephant");
        animal.add("Dog");
        animal.add("giraffe");
        System.out.println(animal);
        animal.remove("giraffe");
        System.out.println(animal);
    }
}
