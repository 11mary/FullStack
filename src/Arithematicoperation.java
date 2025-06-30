import java.util.Scanner;

public class Arithematicoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Addition" +(a+b));
        System.out.println("substraction" +(a-b));
        System.out.println("Multiplication" +(a*b));
        System.out.println("Division" +(a/b));
        System.out.println("Mod" +(a%b));


    }
}
