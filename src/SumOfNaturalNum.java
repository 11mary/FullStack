import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int i=1;
        int sum=0;
        do
        {
            sum+=i;
            i++;
        }while(i<=number);
        System.out.println(sum);

    }
}
