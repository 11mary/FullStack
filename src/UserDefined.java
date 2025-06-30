import java.util.Scanner;

class Pets{

    public void dog(String n,int a){
        System.out.println("Dog's name: " + n+""+"Dog's age"+a);


    }
    public void bird(String na,int ag ){
        System.out.println("bird's name: " + na +""+"bird's age"+ag);

    }


}
public class UserDefined {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a dog name");
        String a=sc.nextLine();
        System.out.println("Enter a dog age");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a bird name");
        String c=sc.nextLine();
        System.out.println("Enter a bird age");
        int d=sc.nextInt();
        Pets obj=new Pets();
        obj.dog(a,b);
        obj.bird(a,b);

    }

}
