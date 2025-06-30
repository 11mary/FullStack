import java.util.Scanner;

public class Arraysreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a array size ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter a array elemets");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--) //reverse
        {
            System.out.println("reverse number is"+array[i]);
        }


    }
}
