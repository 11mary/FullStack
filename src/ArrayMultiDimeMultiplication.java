import java.util.Scanner;

public class ArrayMultiDimeMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of row and col ");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] matrix1=new int[row][col];
        int[][] matrix2=new int[row][col];
        int[][] matrix3=new int[row][col];
        System.out.println("Enter a first matrix");
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                 matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a second matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Maultiplication of matrix");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for (int k = 0; k <col; k++)
                {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }

        }

        for(int i=0;i< row;i++)
        {
            for (int j=0;j< col;j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
