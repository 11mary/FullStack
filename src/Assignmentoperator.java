import java.util.Scanner;

public class Assignmentoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a= sc.nextInt();
        System.out.println("Enter b value");
        int b= sc.nextInt();
        System.out.println("+=" +(a+=2));
        System.out.println("-=" +(a-=4));
        System.out.println("*=" +(a*=3));
        System.out.println("&=" +(a&=5));
        System.out.println("/=" +(a/=7));
        System.out.println("<<=" +(a<<=9));
        System.out.println(">>=" +(a>>=6));
        System.out.println("^=" +(a^=2));
        System.out.println("==" +(a==2));

    }
}
