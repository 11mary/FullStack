public class ArrayMultiDimentinalBasic {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        for (int i=0;i<a.length;i++) //rows
        {
            for (int j = 0; j < a.length; j++) //column
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
