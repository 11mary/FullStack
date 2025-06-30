class Sumof
{
    static class Sumof2 {
        void add(int a, int b) {
            System.out.println("Addistin is " + " " + (a + b));
        }

        void sub(int a, int b) {
            System.out.println("Substraction is " + " " + (a - b));
        }

        void mul(int a, int b) {
            System.out.println("Substraction is " + " " + (a * b));
        }

        void div(int a, int b)
        {
            if (b != 0)
            {
                System.out.println("Division is: "+" " + (a / b));
            } else
            {
                System.out.println("Cannot divide by zero.");
            }
        }

    }
}
public class AssigNestedclsArith {
    public static void main(String[] args) {
        Sumof.Sumof2 obj2 = new Sumof.Sumof2();
        obj2.add(1,2);
        obj2.sub(2,5);
        obj2.mul(2,4);
        obj2.div(1,3);
    }
}
