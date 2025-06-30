import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of arrays");
        int n = sc.nextInt();
        int array[] = new int[n];  //syntax of array size
        System.out.println("Enter the array elements");
        for (int i = 0; i < array.length; i++) //condition
        {
            array[i] = sc.nextInt(); //Stores the elemets
        }
        System.out.println(" the array elements are");
        for (int i = 0; i < array.length; i++)
        {
           System.out.println(array[i] +" "); //prints the array

        }
    }
}