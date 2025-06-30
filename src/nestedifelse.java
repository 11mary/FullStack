import java.util.Scanner;

public class nestedifelse {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter third number");
            int c = sc.nextInt();
            if (a >= b) {
                if (a >= c) {
                    System.out.println(a + " is large number");
                } else {
                    System.out.println(c + "is large number");
                }
            }else
            {
                  if (b >= c) {
                      System.out.println(b + " is large number");
                } else {
                    System.out.println(c + " is large number");
                }
            }
        }
    }


