import java.util.Scanner;

public class ArrayMuliplicationmulti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.of matrix1");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("Enter a no.of matrix2");
        int r2=sc.nextInt();
        int c2= sc.nextInt();

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2=new int[r2][c2];
        int[][] matrix3=new int[r1][c2];

        System.out.println("Enter a elemets for matrix1");
       for (int i=0;i<r1;i++)
       {
           for(int j=0;j<c1;j++)
           {
               matrix1[i][j]= sc.nextInt();
           }
       }
        System.out.println("Enter a elements matrix2");
        for (int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                matrix2[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                matrix3[i][j]=0;
                {
                    for (int k=0;k<c2;k++)
                    {
                        matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
