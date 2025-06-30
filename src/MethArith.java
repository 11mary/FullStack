import java.util.Scanner;

class Arithmatic {

    public void Add(int a, int b) {
        System.out.println("Addition is: " + (a + b));

    }

    public void Sub(int a, int b) {
        System.out.println("Substraction is" + (a - b));
    }

    public void Mul(int a, int b) {
        System.out.println("Multiplication is:" + (a * b));
    }

    public void Div(int a, int b) {
        if (b != 0) {
            System.out.println("Division is:" + (a / b));
        } else {
            System.out.println("denominator should not be zero");
        }

    }
}

    public class MethArith {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value");
            int a = sc.nextInt();
            System.out.println("Enter b value");
            int b = sc.nextInt();
            Arithmatic obj = new Arithmatic();
            obj.Add(a, b);
            obj.Sub(a, b);
            obj.Mul(a, b);
            obj.Div(a, b);
        }
    }
