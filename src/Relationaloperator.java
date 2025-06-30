import java.util.Scanner;

public class Relationaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a= sc.nextInt();
        System.out.println("Enter b value");
        int b= sc.nextInt();
        System.out.println("greater than" +(a>b));
        System.out.println("lesser than" +(a<b));
        System.out.println("equal to" +(a==b));
        System.out.println("greater than equal to" +(a>=b));
        System.out.println("lesser than equal to" +(a<=b));
        System.out.println("Not equal to " +(a!=b));
    }
}
