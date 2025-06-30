import java.util.Scanner;

public class ArrayMULDAdditionof2num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of rows and col");
        int row= sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix1=new int[row][col];
        int[][] matrix2=new int[row][col];
        int[][] matrix3=new int[row][col];
        System.out.println("Enter a 1st matrix elements ");
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1.length;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a 2nd matrix elemets");
        for(int i=0;i<matrix2.length;i++)
        {
            for(int j=0;j<matrix2.length;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of two matrix");
        for(int i=0;i<matrix2.length;i++)
        {
            for(int j=0;j<matrix2.length;j++)
            {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];

            }
        }
        for(int i=0;i<matrix2.length;i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(matrix3[i][j] + " ");

            }

            System.out.println();
        }
    }
}
