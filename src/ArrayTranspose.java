import java.util.Scanner;

public class ArrayTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of rows and cols");
        int row= sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        int[][] transpose=new int[col][row];
        System.out.println("Enter a elements of matrix");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpose of matrix");
        for (int i=0;i<col;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}

