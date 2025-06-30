import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a= sc.nextInt();
        System.out.println("Enter b value");
        int b= sc.nextInt();
        System.out.println("Bitwise AND" +(a&b));
        System.out.println("Bitwise OR" +(a|b));
        System.out.println("Bitwise XOR" +(a^b));
        System.out.println("Compliment" +(~a));
        System.out.println("Bitwise left" +(a<<2));
        System.out.println("Bitwise right" +(a>>2));
    }
}
