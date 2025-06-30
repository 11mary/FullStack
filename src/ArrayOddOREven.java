import java.io.PrintStream;
import java.util.Scanner;

public class ArrayOddOREven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter a array elemts");
        int even=0,odd=0;
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
            if(array[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even number is"+even);
        System.out.println("Odd number is"+odd);
    }
}

