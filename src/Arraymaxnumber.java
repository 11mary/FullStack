import java.util.Scanner;

public class Arraymaxnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n= sc.nextInt();
        int array[]= new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }

        }
        System.out.print("Max elements in a array is"+max);
    }
}