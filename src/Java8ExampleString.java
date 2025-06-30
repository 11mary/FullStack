import java.util.Scanner;

interface M12
{
    void person(String name,int age,String address);
}
public class Java8ExampleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String a = sc.nextLine();
        System.out.println("Enter a age");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a address");
        String c = sc.nextLine();
        M12 obj = (name, age, address) -> {System.out.println(a);System.out.println(b);System.out.println(c);};
       obj.person(a,b,c);
    }
}
