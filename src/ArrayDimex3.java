public class ArrayDimex3 {
    public static void main(String[] args) {
        int[][] a= {{1,2,3},
                    {4,5,6},
                    {7,8,9,}};
        System.out.println("primary diagnol matrix is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i][i]);
        }
        System.out.println("Secondary diagnol matrix");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i][a.length-1-i]);
        }
    }
}
